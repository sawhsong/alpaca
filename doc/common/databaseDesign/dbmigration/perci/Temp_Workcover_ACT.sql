 select connect_by_root my_id as root,
        level,
        connect_by_isleaf as is_leaf,
        substr(sys_connect_by_path(my_id, '/'), 2) as path,
        src.*
   from (select to_char('0') parent_id,
                to_char(code_group_id) my_id,
                code_group_id,
                code_group_name,
                division,
                sub_division,
                is_active grp_is_active,
                group_class,
                group_name,
                description grp_description,
                created_by grp_created_by,
                to_char(creation_date, 'dd-mm-yyyy') grp_creation_date,
                last_updated_by grp_last_updated_by,
                to_char(last_update_date, 'dd-mm-yyyy') grp_last_update_date,
                null code_rate_id,
                null anzic,
                null ratm_is_active,
                null code_name,
                null code_description,
                null code_primary_activity,
                null ratm_created_by,
                null ratm_creation_date,
                null ratm_last_updated_by,
                null ratm_last_update_date,
                null code_rate_d_id,
                null start_date,
                null end_date,
                null ratd_is_active,
                null percentage,
                null ratd_created_by,
                null ratd_creation_date,
                null ratd_last_updated_by,
                null ratd_last_update_date
           from wc_act_code_group
         union
         select to_char(a.code_group_id) parent_id,
                to_char(a.code_rate_id||'m') my_id,
                null code_group_id,
                null code_group_name,
                null division,
                null sub_division,
                null grp_is_active,
                null group_class,
                null group_name,
                null grp_description,
                null grp_created_by,
                null grp_creation_date,
                null grp_last_updated_by,
                null grp_last_update_date,
                a.code_rate_id,
                a.anzic,
                a.is_active ratm_is_active,
                a.code_name,
                a.code_description,
                a.code_primary_activity,
                a.created_by ratm_created_by,
                to_char(a.creation_date, 'dd-mm-yyyy') ratm_creation_date,
                a.last_updated_by ratm_last_updated_by,
                to_char(a.last_update_date, 'dd-mm-yyyy') ratm_last_update_date,
                null code_rate_d_id,
                null start_date,
                null end_date,
                null ratd_is_active,
                null percentage,
                null ratd_created_by,
                null ratd_creation_date,
                null ratd_last_updated_by,
                null ratd_last_update_date
           from wc_act_code_rate a,
                wc_act_code_rate_d b
          where b.is_active = 'Y'
            and a.code_rate_id = b.code_rate_id
         union
         select to_char(b.code_rate_id||'m') parent_id,
                to_char(b.code_rate_d_id||'d') my_id,
                null code_group_id,
                null code_group_name,
                null division,
                null sub_division,
                null grp_is_active,
                null group_class,
                null group_name,
                null grp_description,
                null grp_created_by,
                null grp_creation_date,
                null grp_last_updated_by,
                null grp_last_update_date,
                null code_rate_id,
                null anzic,
                null ratm_is_active,
                null code_name,
                null code_description,
                null code_primary_activity,
                null ratm_created_by,
                null ratm_creation_date,
                null ratm_last_updated_by,
                null ratm_last_update_date,
                b.code_rate_d_id,
                to_char(b.start_date, 'dd-mm-yyyy') start_date,
                to_char(b.end_date, 'dd-mm-yyyy') end_date,
                b.is_active ratd_is_active,
                b.percentage,
                b.created_by ratd_created_by,
                to_char(b.creation_date, 'dd-mm-yyyy') ratd_creation_date,
                b.last_updated_by ratd_last_updated_by,
                to_char(b.last_update_date, 'dd-mm-yyyy') ratd_last_update_date
           from wc_act_code_rate a,
                wc_act_code_rate_d b
          where b.is_active = 'Y'
            and a.code_rate_id = b.code_rate_id
        ) src
connect by prior my_id = parent_id
  start with parent_id = '0'
  order siblings by group_name,
        code_name,
        start_date desc
;