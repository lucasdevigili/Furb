CREATE TABLE `departamento` (
	`cd_depto` INT(11) NOT NULL,
	`nm_depto` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`vl_orcto` DECIMAL(8,2) NULL DEFAULT NULL,
	PRIMARY KEY (`cd_depto`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;
