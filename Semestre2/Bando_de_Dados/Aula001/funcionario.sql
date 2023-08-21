CREATE TABLE `funcionario` (
	`cd_func` INT(11) NOT NULL,
	`cd_depto` INT(11) NULL DEFAULT NULL,
	`mn_func` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`cd_func`) USING BTREE,
	INDEX `cd_depto` (`cd_depto`) USING BTREE,
	CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`cd_depto`) REFERENCES `departamento` (`cd_depto`) ON UPDATE RESTRICT ON DELETE RESTRICT
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;
