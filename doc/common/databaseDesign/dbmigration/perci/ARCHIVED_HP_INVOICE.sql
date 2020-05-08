/**
 * Table Name  : ARCHIVED_HP_INVOICE
 * Description : ARCHIVED_HP_INVOICE
 */
drop table archived_hp_invoice cascade constraints;
purge recyclebin;

create table archived_hp_invoice (
    business_group_id               number                                       not null,      -- 
    created_by                      number                                       not null,      -- 
    creation_date                   date                                         not null,      -- 
    invoice_date                    date                                         not null,      -- 
    invoice_id                      number                                       not null,      -- 
    invoice_number                  varchar2(30)                                 not null,      -- 
    invoice_type                    varchar2(10)                                 not null,      -- 
    last_updated_by                 number                                       not null,      -- 
    last_update_date                date                                         not null,      -- 
    pay_to_organisation_id          number                                       not null,      -- 
    assignment_process_id           number,                                                     -- 
    billing_code_id                 number,                                                     -- 
    close_date                      date,                                                       -- 
    comment_id                      number,                                                     -- 
    con_period_end_date             date,                                                       -- 
    con_period_start_date           date,                                                       -- 
    gst_amount                      number(12,2)        default 0,                              -- 
    gst_per                         number,                                                     -- 
    invoice_amount                  number(12,2),                                               -- 
    invoice_payroll_notes           varchar2(4000),                                             -- 
    inv_cr_status                   varchar2(1)         default 'A',                            -- 
    mail_to_address                 varchar2(200),                                              -- 
    mail_to_attention               varchar2(100),                                              -- 
    mail_to_country                 varchar2(15),                                               -- 
    mail_to_organisation_id         number,                                                     -- 
    mail_to_person_id               number,                                                     -- 
    mail_to_post_code               varchar2(30),                                               -- 
    mail_to_state                   varchar2(30),                                               -- 
    mail_to_suburb                  varchar2(50),                                               -- 
    payment_terms                   varchar2(30),                                               -- 
    pay_to_address                  varchar2(200),                                              -- 
    pay_to_country                  varchar2(30),                                               -- 
    pay_to_fax                      varchar2(50),                                               -- 
    pay_to_post_code                varchar2(30),                                               -- 
    pay_to_state                    varchar2(30),                                               -- 
    pay_to_suburb                   varchar2(50),                                               -- 
    pay_to_telephone                varchar2(50),                                               -- 
    period_id                       number,                                                     -- 
    person_id                       number,                                                     -- 
    po_number                       varchar2(30),                                               -- 
    source                          varchar2(25),                                               -- 
    source_id                       number,                                                     -- 
    status                          varchar2(1)                                                 -- 
)
pctfree 20 pctused 80 tablespace alpaca_data storage(initial 100k next 100k maxextents 2000 pctincrease 0);

comment on table  archived_hp_invoice                                            is 'ARCHIVED_HP_INVOICE';

comment on column archived_hp_invoice.business_group_id                          is '';
comment on column archived_hp_invoice.created_by                                 is '';
comment on column archived_hp_invoice.creation_date                              is '';
comment on column archived_hp_invoice.invoice_date                               is '';
comment on column archived_hp_invoice.invoice_id                                 is '';
comment on column archived_hp_invoice.invoice_number                             is '';
comment on column archived_hp_invoice.invoice_type                               is '';
comment on column archived_hp_invoice.last_updated_by                            is '';
comment on column archived_hp_invoice.last_update_date                           is '';
comment on column archived_hp_invoice.pay_to_organisation_id                     is '';
comment on column archived_hp_invoice.assignment_process_id                      is '';
comment on column archived_hp_invoice.billing_code_id                            is '';
comment on column archived_hp_invoice.close_date                                 is '';
comment on column archived_hp_invoice.comment_id                                 is '';
comment on column archived_hp_invoice.con_period_end_date                        is '';
comment on column archived_hp_invoice.con_period_start_date                      is '';
comment on column archived_hp_invoice.gst_amount                                 is '';
comment on column archived_hp_invoice.gst_per                                    is '';
comment on column archived_hp_invoice.invoice_amount                             is '';
comment on column archived_hp_invoice.invoice_payroll_notes                      is '';
comment on column archived_hp_invoice.inv_cr_status                              is '';
comment on column archived_hp_invoice.mail_to_address                            is '';
comment on column archived_hp_invoice.mail_to_attention                          is '';
comment on column archived_hp_invoice.mail_to_country                            is '';
comment on column archived_hp_invoice.mail_to_organisation_id                    is '';
comment on column archived_hp_invoice.mail_to_person_id                          is '';
comment on column archived_hp_invoice.mail_to_post_code                          is '';
comment on column archived_hp_invoice.mail_to_state                              is '';
comment on column archived_hp_invoice.mail_to_suburb                             is '';
comment on column archived_hp_invoice.payment_terms                              is '';
comment on column archived_hp_invoice.pay_to_address                             is '';
comment on column archived_hp_invoice.pay_to_country                             is '';
comment on column archived_hp_invoice.pay_to_fax                                 is '';
comment on column archived_hp_invoice.pay_to_post_code                           is '';
comment on column archived_hp_invoice.pay_to_state                               is '';
comment on column archived_hp_invoice.pay_to_suburb                              is '';
comment on column archived_hp_invoice.pay_to_telephone                           is '';
comment on column archived_hp_invoice.period_id                                  is '';
comment on column archived_hp_invoice.person_id                                  is '';
comment on column archived_hp_invoice.po_number                                  is '';
comment on column archived_hp_invoice.source                                     is '';
comment on column archived_hp_invoice.source_id                                  is '';
comment on column archived_hp_invoice.status                                     is '';
