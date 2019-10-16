INSERT INTO `mydb`.`proveedor` (`nombre`, `direccion`, `nif`) VALUES ('proveedor 1', 'direccion 1', '11111111A'); 
INSERT INTO `mydb`.`proveedor` (`nombre`, `direccion`, `nif`) VALUES ('proveedor 2', 'direccion 2', '22222222B'); 

INSERT INTO `mydb`.`producto` (`codigo`, `precio`, `idproveedor`) VALUES ('codigo1', '100.11', '1');
INSERT INTO `mydb`.`producto` (`codigo`, `precio`, `idproveedor`) VALUES ('codigo2', '100.11', '1'); 

select * from proveedor p left join producto pr on p.idproveedor = pr.idproveedor where p.idproveedor = 1;