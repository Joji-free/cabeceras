package service;
/**
 * Created by IntelliJ IDEA.
 *   User: Anderson Soto
 *   Date: 14/5/2025
 *   Time: 23:08
 */


import models. Producto;

import java.util.ArrayList;
import java. util.Arrays;
import java.util.List;

public class ProductoServiceImplement implements ProductoService {

    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L,"laptop","computacion", 523.21),
        new Producto( 2L ,"Mouse", "inalambrico", 15.25),
        new Producto(3L, "Impresora", "tinta continua", 256.25));
    }
}
