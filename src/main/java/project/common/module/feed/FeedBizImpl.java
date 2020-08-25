package project.common.module.feed;

import java.net.URL;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jdom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import project.common.extend.BaseBiz;
import zebra.data.DataSet;
import zebra.data.ParamEntity;
import zebra.exception.FrameworkException;
import zebra.util.CommonUtil;
import zebra.util.ConfigUtil;

public class FeedBizImpl extends BaseBiz implements FeedBiz {
	@SuppressWarnings("unchecked")
	public ParamEntity getRssAbcJustin(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		DataSet dsRs = new DataSet();
		String url = requestDataSet.getValue("url");
		SyndFeedInput input = new SyndFeedInput();
		URL feedUrl = new URL(url);
		SyndFeed feed;
		String header[] = new String[] {"header", "link", "contents", "img", "date"};
		String dateFormat = ConfigUtil.getProperty("format.dateTime.java");
		int index = 0;

		try {
			dsRs.addName(header);
			feed = input.build(new XmlReader(feedUrl));

			if (feed != null) {
				List<?> feedList = feed.getEntries();

				for (Object obj : feedList) {
					if (index == 5) {break;}

					SyndEntryImpl entry = (SyndEntryImpl)obj;

					dsRs.addRow();
					dsRs.setValue(dsRs.getRowCnt()-1, "header", entry.getTitle());
					dsRs.setValue(dsRs.getRowCnt()-1, "link", entry.getLink());
					dsRs.setValue(dsRs.getRowCnt()-1, "contents", entry.getDescription().getValue());
					dsRs.setValue(dsRs.getRowCnt()-1, "date", CommonUtil.toString(entry.getPublishedDate(), dateFormat));

					List<Element> foreignMarkups = (List<Element>)entry.getForeignMarkup();
					for (Element foreignMarkup : foreignMarkups) {
						boolean foundImage = false;
						List<Element> children = foreignMarkup.getChildren();
						for (Element child : children) {
							String name = child.getName(), medium = child.getAttributeValue("medium");
							if (CommonUtil.equalsIgnoreCase(name, "content") && CommonUtil.equalsIgnoreCase(medium, "image")) {
								dsRs.setValue(dsRs.getRowCnt()-1, "img", child.getAttributeValue("url"));
								foundImage = true;
								break;
							}
						}

						if (foundImage) {
							break;
						}
					}

					index++;
				}
			}

			paramEntity.setAjaxResponseDataSet(dsRs);
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	public ParamEntity getRssNewsComAuWorld(ParamEntity paramEntity) throws Exception {
		DataSet requestDataSet = paramEntity.getRequestDataSet();
		DataSet dsRs = new DataSet();
		String url = requestDataSet.getValue("url");
		SyndFeedInput input = new SyndFeedInput();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document document;
		URL feedUrl = new URL(url);
		SyndFeed feed;
		String header[] = new String[] {"header", "link", "contents", "img", "date"};
		String dateFormat = ConfigUtil.getProperty("format.dateTime.java");
		int index = 0;

		try {
			dsRs.addName(header);
			feed = input.build(new XmlReader(feedUrl));
			docBuilderFactory.setValidating(false);
			document = docBuilder.parse(feedUrl.openStream());
			NodeList nodeList = document.getElementsByTagName("item");

			if (feed != null) {
				List<?> feedList = feed.getEntries();

				for (Object obj : feedList) {
					if (index == 5) {break;}

					SyndEntryImpl entry = (SyndEntryImpl)obj;

					dsRs.addRow();
					dsRs.setValue(dsRs.getRowCnt()-1, "header", entry.getTitle());
					dsRs.setValue(dsRs.getRowCnt()-1, "link", entry.getLink());
					dsRs.setValue(dsRs.getRowCnt()-1, "contents", entry.getDescription().getValue());
					dsRs.setValue(dsRs.getRowCnt()-1, "date", CommonUtil.toString(feed.getPublishedDate(), dateFormat));

					Node imgNode = searchNode(nodeList.item(index).getChildNodes(), "image");
					Node imgUrl = searchNode(imgNode.getChildNodes(), "url");
					dsRs.setValue(dsRs.getRowCnt()-1, "img", imgUrl.getTextContent());

					index++;
				}
			}

			paramEntity.setAjaxResponseDataSet(dsRs);
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}

	private Node searchNode(NodeList nodeList, String nodeName) {
		Node nodeRtn = null;

		for (int i=0; i<nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (CommonUtil.equals(node.getNodeName(), nodeName)) {
				return node;
			}

			searchNode(node.getChildNodes(), nodeName);
		}

		return nodeRtn;
	}
}