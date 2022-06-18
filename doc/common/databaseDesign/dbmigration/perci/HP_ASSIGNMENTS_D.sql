/**
 * Table Name  : HP_ASSIGNMENTS_D
 * Description : HP_ASSIGNMENTS_D
 */
drop table hp_assignments_d cascade constraints;
purge recyclebin;

create table hp_assignments_d (
    assignment_id                   number                                       not null,      -- 
    from_date                       date                                         not null,      -- 
    to_date                         date                                         not null,      -- 
    created_by                      number                                       not null,      -- 
    creation_date                   date                                         not null,      -- 
    last_updated_by                 number                                       not null,      -- 
    last_update_date                date                                         not null,      -- 
    person_id                       number                                       not null,      -- 
    billing_organisation_id         number,                                                     -- 
    eu_organisation_id              number,                                                     -- 
    approved_expenses               varchar2(4000),                                             -- 
    asg_active                      varchar2(1)         default 'Y',                            -- 
    assignment_end_date             date,                                                       -- 
    assignment_number               varchar2(200),                                              -- 
    assignment_start_date           date,                                                       -- 
    attribute1                      varchar2(150),                                              -- 
    attribute10                     varchar2(150),                                              -- 
    attribute9                      varchar2(150),                                              -- 
    automatic_invoice               varchar2(1),                                                -- 
    basic_salary                    varchar2(1),                                                -- 
    billing_code                    varchar2(30),                                               -- 
    billing_code_id                 number,                                                     -- 
    billing_organisation_person_id  number,                                                     -- 
    business_group_id               number,                                                     -- 
    comments                        varchar2(4000),                                             -- 
    cost_centre                     varchar2(150),                                              -- 
    created_as                      varchar2(25),                                               -- 
    deliverables_approver_1         number,                                                     -- 
    deliverables_approver_2         number,                                                     -- 
    deliverables_approver_3         number,                                                     -- 
    deliverables_appr_noti_to_id    number,                                                     -- 
    deliverables_appr_noti_to_org   number,                                                     -- 
    deliverables_name               varchar2(500),                                              -- 
    element_1                       number,                                                     -- 
    element_2                       number,                                                     -- 
    element_3                       number,                                                     -- 
    element_4                       number,                                                     -- 
    element_5                       number,                                                     -- 
    engagement_contract_type        varchar2(200),                                              -- 
    equipment_details               varchar2(4000),                                             -- 
    equipment_required_yn           varchar2(1),                                                -- 
    ets_approval_notification_to    number,                                                     -- 
    ets_approval_noti_to_2          number,                                                     -- 
    eu_contact_person_id            number,                                                     -- 
    expense_approval_noti_to_id     number,                                                     -- 
    expense_approval_noti_to_org    number,                                                     -- 
    expense_approver_1              number,                                                     -- 
    expense_approver_2              number,                                                     -- 
    expense_approver_3              number,                                                     -- 
    expense_name                    varchar2(100),                                              -- 
    gst_exempt                      varchar2(1),                                                -- 
    invoice_recipient_email         varchar2(200),                                              -- 
    is_bulk_approval                varchar2(1),                                                -- 
    is_bulk_approval_deliverables   varchar2(1),                                                -- 
    is_bulk_approval_expense        varchar2(1),                                                -- 
    is_daily                        varchar2(2),                                                -- 
    is_start_end_time               varchar2(2),                                                -- 
    job_title                       varchar2(1000),                                             -- 
    modern_award_description        varchar2(2000),                                             -- 
    modern_award_id                 number,                                                     -- 
    payroll_notes                   varchar2(4000),                                             -- 
    payslip_email                   varchar2(100),                                              -- 
    pay_arrangement                 varchar2(10),                                               -- 
    pay_method_id                   number,                                                     -- 
    preferred                       varchar2(1),                                                -- 
    prt_status                      varchar2(30),                                               -- 
    rate                            number,                                                     -- 
    rate1                           number,                                                     -- 
    rate2                           number,                                                     -- 
    rate3                           number,                                                     -- 
    rate4                           number,                                                     -- 
    rate5                           number,                                                     -- 
    reference_a_po                  varchar2(150),                                              -- 
    reference_b                     varchar2(150),                                              -- 
    reference_c                     varchar2(150),                                              -- 
    reference_d                     varchar2(150),                                              -- 
    reference_no_1                  varchar2(200),                                              -- 
    reference_no_2                  varchar2(200),                                              -- 
    reference_no_3                  varchar2(200),                                              -- 
    restraint_of_trade              varchar2(4000),                                             -- 
    service_description             varchar2(1000),                                             -- 
    special_conditions              varchar2(4000),                                             -- 
    termination_notice              varchar2(5),                                                -- 
    termination_notice_unit         varchar2(12),                                               -- 
    timecard_approval_id            number,                                                     -- 
    timecard_approval_rate_hidden   char(1),                                                    -- 
    timecard_layout                 varchar2(30),                                               -- 
    timecard_required               varchar2(1),                                                -- 
    timecard_secondary_approval_id  number,                                                     -- 
    timecard_tertiary_approval_id   number,                                                     -- 
    timesheet_name                  varchar2(100),                                              -- 
    timesheet_units                 varchar2(5),                                                -- 
    unit                            varchar2(15),                                               -- 
    use_award_calculation           varchar2(1),                                                -- 
    use_deliverables                varchar2(1),                                                -- 
    use_expense                     varchar2(1),                                                -- 
    wc_organisation_type_flag       varchar2(10),                                               -- 
    wc_org_code_rate_link_id        number,                                                     -- 
    working_state                   varchar2(30),                                               -- 
    work_end_time                   varchar2(5),                                                -- 
    work_start_time                 varchar2(5),                                                -- 

    constraint pk_hp_assignments_d primary key(assignment_id, from_date, to_date)
    using index tablespace alpaca_idx storage(initial 50k next 50k pctincrease 0)
)
pctfree 20 pctused 80 tablespace alpaca_data storage(initial 100k next 100k maxextents 2000 pctincrease 0);

comment on table  hp_assignments_d                                               is 'HP_ASSIGNMENTS_D';

comment on column hp_assignments_d.assignment_id                                 is '';
comment on column hp_assignments_d.from_date                                     is '';
comment on column hp_assignments_d.to_date                                       is '';
comment on column hp_assignments_d.created_by                                    is '';
comment on column hp_assignments_d.creation_date                                 is '';
comment on column hp_assignments_d.last_updated_by                               is '';
comment on column hp_assignments_d.last_update_date                              is '';
comment on column hp_assignments_d.person_id                                     is '';
comment on column hp_assignments_d.billing_organisation_id                       is '';
comment on column hp_assignments_d.eu_organisation_id                            is '';
comment on column hp_assignments_d.approved_expenses                             is '';
comment on column hp_assignments_d.asg_active                                    is '';
comment on column hp_assignments_d.assignment_end_date                           is '';
comment on column hp_assignments_d.assignment_number                             is '';
comment on column hp_assignments_d.assignment_start_date                         is '';
comment on column hp_assignments_d.attribute1                                    is '';
comment on column hp_assignments_d.attribute10                                   is '';
comment on column hp_assignments_d.attribute9                                    is '';
comment on column hp_assignments_d.automatic_invoice                             is '';
comment on column hp_assignments_d.basic_salary                                  is '';
comment on column hp_assignments_d.billing_code                                  is '';
comment on column hp_assignments_d.billing_code_id                               is '';
comment on column hp_assignments_d.billing_organisation_person_id                is '';
comment on column hp_assignments_d.business_group_id                             is '';
comment on column hp_assignments_d.comments                                      is '';
comment on column hp_assignments_d.cost_centre                                   is '';
comment on column hp_assignments_d.created_as                                    is '';
comment on column hp_assignments_d.deliverables_approver_1                       is '';
comment on column hp_assignments_d.deliverables_approver_2                       is '';
comment on column hp_assignments_d.deliverables_approver_3                       is '';
comment on column hp_assignments_d.deliverables_appr_noti_to_id                  is '';
comment on column hp_assignments_d.deliverables_appr_noti_to_org                 is '';
comment on column hp_assignments_d.deliverables_name                             is '';
comment on column hp_assignments_d.element_1                                     is '';
comment on column hp_assignments_d.element_2                                     is '';
comment on column hp_assignments_d.element_3                                     is '';
comment on column hp_assignments_d.element_4                                     is '';
comment on column hp_assignments_d.element_5                                     is '';
comment on column hp_assignments_d.engagement_contract_type                      is '';
comment on column hp_assignments_d.equipment_details                             is '';
comment on column hp_assignments_d.equipment_required_yn                         is '';
comment on column hp_assignments_d.ets_approval_notification_to                  is '';
comment on column hp_assignments_d.ets_approval_noti_to_2                        is '';
comment on column hp_assignments_d.eu_contact_person_id                          is '';
comment on column hp_assignments_d.expense_approval_noti_to_id                   is '';
comment on column hp_assignments_d.expense_approval_noti_to_org                  is '';
comment on column hp_assignments_d.expense_approver_1                            is '';
comment on column hp_assignments_d.expense_approver_2                            is '';
comment on column hp_assignments_d.expense_approver_3                            is '';
comment on column hp_assignments_d.expense_name                                  is '';
comment on column hp_assignments_d.gst_exempt                                    is '';
comment on column hp_assignments_d.invoice_recipient_email                       is '';
comment on column hp_assignments_d.is_bulk_approval                              is '';
comment on column hp_assignments_d.is_bulk_approval_deliverables                 is '';
comment on column hp_assignments_d.is_bulk_approval_expense                      is '';
comment on column hp_assignments_d.is_daily                                      is '';
comment on column hp_assignments_d.is_start_end_time                             is '';
comment on column hp_assignments_d.job_title                                     is '';
comment on column hp_assignments_d.modern_award_description                      is '';
comment on column hp_assignments_d.modern_award_id                               is '';
comment on column hp_assignments_d.payroll_notes                                 is '';
comment on column hp_assignments_d.payslip_email                                 is '';
comment on column hp_assignments_d.pay_arrangement                               is '';
comment on column hp_assignments_d.pay_method_id                                 is '';
comment on column hp_assignments_d.preferred                                     is '';
comment on column hp_assignments_d.prt_status                                    is '';
comment on column hp_assignments_d.rate                                          is '';
comment on column hp_assignments_d.rate1                                         is '';
comment on column hp_assignments_d.rate2                                         is '';
comment on column hp_assignments_d.rate3                                         is '';
comment on column hp_assignments_d.rate4                                         is '';
comment on column hp_assignments_d.rate5                                         is '';
comment on column hp_assignments_d.reference_a_po                                is '';
comment on column hp_assignments_d.reference_b                                   is '';
comment on column hp_assignments_d.reference_c                                   is '';
comment on column hp_assignments_d.reference_d                                   is '';
comment on column hp_assignments_d.reference_no_1                                is '';
comment on column hp_assignments_d.reference_no_2                                is '';
comment on column hp_assignments_d.reference_no_3                                is '';
comment on column hp_assignments_d.restraint_of_trade                            is '';
comment on column hp_assignments_d.service_description                           is '';
comment on column hp_assignments_d.special_conditions                            is '';
comment on column hp_assignments_d.termination_notice                            is '';
comment on column hp_assignments_d.termination_notice_unit                       is '';
comment on column hp_assignments_d.timecard_approval_id                          is '';
comment on column hp_assignments_d.timecard_approval_rate_hidden                 is '';
comment on column hp_assignments_d.timecard_layout                               is '';
comment on column hp_assignments_d.timecard_required                             is '';
comment on column hp_assignments_d.timecard_secondary_approval_id                is '';
comment on column hp_assignments_d.timecard_tertiary_approval_id                 is '';
comment on column hp_assignments_d.timesheet_name                                is '';
comment on column hp_assignments_d.timesheet_units                               is '';
comment on column hp_assignments_d.unit                                          is '';
comment on column hp_assignments_d.use_award_calculation                         is '';
comment on column hp_assignments_d.use_deliverables                              is '';
comment on column hp_assignments_d.use_expense                                   is '';
comment on column hp_assignments_d.wc_organisation_type_flag                     is '';
comment on column hp_assignments_d.wc_org_code_rate_link_id                      is '';
comment on column hp_assignments_d.working_state                                 is '';
comment on column hp_assignments_d.work_end_time                                 is '';
comment on column hp_assignments_d.work_start_time                               is '';
