/**
 * Table Name  : HP_PERSON_D
 * Description : HP_PERSON_D
 */
drop table hp_person_d cascade constraints;
purge recyclebin;

create table hp_person_d (
    person_id                       number                                       not null,      -- 
    person_number                   varchar2(50)                                 not null,      -- 
    business_group_id               number                                       not null,      -- 
    created_by                      number                                       not null,      -- 
    creation_date                   date                                         not null,      -- 
    from_date                       date                                         not null,      -- 
    last_updated_by                 number                                       not null,      -- 
    last_update_date                date                                         not null,      -- 
    to_date                         date                                         not null,      -- 
    employment_company_org_id       number,                                                     -- 
    attribute3                      varchar2(150),                                              -- 
    attribute4                      varchar2(150),                                              -- 
    attribute5                      varchar2(150),                                              -- 
    attribute6                      varchar2(150),                                              -- 
    attribute7                      varchar2(150),                                              -- 
    attribute8                      varchar2(150),                                              -- 
    contract_days_with_ecms         varchar2(30),                                               -- 
    customer_support                number,                                                     -- 
    date_of_birth                   date,                                                       -- 
    ecms_account_mgr_id             number,                                                     -- 
    ecms_cs_consultant_id           number,                                                     -- 
    ecms_payroll_consultant_id      varchar2(50),                                               -- 
    employment_type                 varchar2(30),                                               -- 
    first_assignment_date           date,                                                       -- 
    first_contact                   date,                                                       -- 
    first_name                      varchar2(100),                                              -- 
    full_name                       varchar2(240),                                              -- 
    function                        varchar2(2000),                                             -- 
    gender                          varchar2(1),                                                -- 
    gtm_profile                     varchar2(150),                                              -- 
    gtm_stage                       varchar2(150),                                              -- 
    lafha_amount                    number,                                                     -- 
    lafha_eligible                  varchar2(1),                                                -- 
    lafha_lease_expiry              date,                                                       -- 
    life_cycle_stage                varchar2(150),                                              -- 
    marital_status                  varchar2(10),                                               -- 
    member_since                    date,                                                       -- 
    middle_name                     varchar2(60),                                               -- 
    payroll_notes                   varchar2(4000),                                             -- 
    payslip_email                   varchar2(100),                                              -- 
    personal_comment_id             number,                                                     -- 
    person_type                     varchar2(100),                                              -- 
    preferred                       varchar2(1),                                                -- 
    preferred_name                  varchar2(150),                                              -- 
    prefix                          varchar2(5),                                                -- 
    previous_employment_model       varchar2(30),                                               -- 
    primary_person_type_id          number,                                                     -- 
    reference_no                    varchar2(100),                                              -- 
    reference_no_2                  varchar2(200),                                              -- 
    reference_no_3                  varchar2(200),                                              -- 
    referral_id                     number,                                                     -- 
    referral_organisation_id        number,                                                     -- 
    resignation_comment_id          number,                                                     -- 
    resignation_date                date,                                                       -- 
    resignation_reason              varchar2(30),                                               -- 
    service_status                  varchar2(30),                                               -- 
    service_type                    varchar2(30),                                               -- 
    skills                          varchar2(2000),                                             -- 
    surname                         varchar2(60),                                               -- 
    title                           varchar2(250),                                              -- 

    constraint pk_hp_person_d primary key(person_id),
    constraint uk_184626277207900 unique(person_number)
    using index tablespace alpaca_idx storage(initial 50k next 50k pctincrease 0)
)
pctfree 20 pctused 80 tablespace alpaca_data storage(initial 100k next 100k maxextents 2000 pctincrease 0);

comment on table  hp_person_d                                                    is 'HP_PERSON_D';

comment on column hp_person_d.person_id                                          is '';
comment on column hp_person_d.person_number                                      is '';
comment on column hp_person_d.business_group_id                                  is '';
comment on column hp_person_d.created_by                                         is '';
comment on column hp_person_d.creation_date                                      is '';
comment on column hp_person_d.from_date                                          is '';
comment on column hp_person_d.last_updated_by                                    is '';
comment on column hp_person_d.last_update_date                                   is '';
comment on column hp_person_d.to_date                                            is '';
comment on column hp_person_d.employment_company_org_id                          is '';
comment on column hp_person_d.attribute3                                         is '';
comment on column hp_person_d.attribute4                                         is '';
comment on column hp_person_d.attribute5                                         is '';
comment on column hp_person_d.attribute6                                         is '';
comment on column hp_person_d.attribute7                                         is '';
comment on column hp_person_d.attribute8                                         is '';
comment on column hp_person_d.contract_days_with_ecms                            is '';
comment on column hp_person_d.customer_support                                   is '';
comment on column hp_person_d.date_of_birth                                      is '';
comment on column hp_person_d.ecms_account_mgr_id                                is '';
comment on column hp_person_d.ecms_cs_consultant_id                              is '';
comment on column hp_person_d.ecms_payroll_consultant_id                         is '';
comment on column hp_person_d.employment_type                                    is '';
comment on column hp_person_d.first_assignment_date                              is '';
comment on column hp_person_d.first_contact                                      is '';
comment on column hp_person_d.first_name                                         is '';
comment on column hp_person_d.full_name                                          is '';
comment on column hp_person_d.function                                           is '';
comment on column hp_person_d.gender                                             is '';
comment on column hp_person_d.gtm_profile                                        is '';
comment on column hp_person_d.gtm_stage                                          is '';
comment on column hp_person_d.lafha_amount                                       is '';
comment on column hp_person_d.lafha_eligible                                     is '';
comment on column hp_person_d.lafha_lease_expiry                                 is '';
comment on column hp_person_d.life_cycle_stage                                   is '';
comment on column hp_person_d.marital_status                                     is '';
comment on column hp_person_d.member_since                                       is '';
comment on column hp_person_d.middle_name                                        is '';
comment on column hp_person_d.payroll_notes                                      is '';
comment on column hp_person_d.payslip_email                                      is '';
comment on column hp_person_d.personal_comment_id                                is '';
comment on column hp_person_d.person_type                                        is '';
comment on column hp_person_d.preferred                                          is '';
comment on column hp_person_d.preferred_name                                     is '';
comment on column hp_person_d.prefix                                             is '';
comment on column hp_person_d.previous_employment_model                          is '';
comment on column hp_person_d.primary_person_type_id                             is '';
comment on column hp_person_d.reference_no                                       is '';
comment on column hp_person_d.reference_no_2                                     is '';
comment on column hp_person_d.reference_no_3                                     is '';
comment on column hp_person_d.referral_id                                        is '';
comment on column hp_person_d.referral_organisation_id                           is '';
comment on column hp_person_d.resignation_comment_id                             is '';
comment on column hp_person_d.resignation_date                                   is '';
comment on column hp_person_d.resignation_reason                                 is '';
comment on column hp_person_d.service_status                                     is '';
comment on column hp_person_d.service_type                                       is '';
comment on column hp_person_d.skills                                             is '';
comment on column hp_person_d.surname                                            is '';
comment on column hp_person_d.title                                              is '';
