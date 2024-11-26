--liquidbase formatted sql
--changeset Bukevsky:20241124-00-0-create-journal-tu152.sql
--comment Создание таблицы журнала ТУ-152

CREATE TABLE IF NOT EXISTS JournalTu152 (
        id BIGSERIAL PRIMARY KEY,
        date DATE,
        direction TEXT,
        train TEXT,
        weight FLOAT,
        axles TEXT,
        reception_start_time INT,
        incoming_driver_name TEXT,
        incoming_driver_assistant_name TEXT,
        handover_time INT,
        outgoing_driver_name TEXT,
        outgoing_driver_assistant_name TEXT,
        acceptance_time INT,
        fuel_amount FLOAT,
        remarks_defects TEXT,
        handover_signature BOOLEAN,
        acceptance_signature BOOLEAN,
        defect_correction_date DATE,
        position TEXT,
        final_signature BOOLEAN
);

comment on table JournalTu152 is 'Журнал ТУ-152';
comment on column JournalTu152.date is 'Дата создания журнала';
comment on column JournalTu152.direction is 'Направление';
comment on column JournalTu152.train is 'Поезд';
comment on column JournalTu152.weight is 'Вес поезда';
comment on column JournalTu152.axles is 'Оси';
comment on column JournalTu152.reception_start_time is 'Начало приемки';
comment on column JournalTu152.incoming_driver_name is 'ФИО машиниста прибывшего';
comment on column JournalTu152.incoming_driver_assistant_name is 'ФИО помощника машиниста прибывшего';
comment on column JournalTu152.handover_time is 'Время сдачи';
comment on column JournalTu152.outgoing_driver_name is 'ФИО машиниста отправляющего';
comment on column JournalTu152.outgoing_driver_assistant_name is 'ФИО помощника машиниста отправляющего';
comment on column JournalTu152.acceptance_time is 'Время принятия';
comment on column JournalTu152.fuel_amount is 'Количество топлива';
comment on column JournalTu152.remarks_defects is 'Замечания и неисправности';
comment on column JournalTu152.handover_signature is 'Подпись сдающего';
comment on column JournalTu152.acceptance_signature is 'Подпись принимающего';
comment on column JournalTu152.defect_correction_date is 'Дата устранения неисправности';
comment on column JournalTu152.position is 'Должность';
comment on column JournalTu152.final_signature is 'Подпись устраняющего неисправность';