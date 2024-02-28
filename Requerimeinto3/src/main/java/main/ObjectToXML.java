package main;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import entidad.Articulos;

public class ObjectToXML {

    public static void main(String[] args) {

        JAXBContext contexto;
        Marshaller m;

        try {
            contexto = JAXBContext.newInstance(Articulos.class);
            m = contexto.createMarshaller();
            
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            List<Articulos> listaArticulos = new ArrayList<>();
            Articulos producto1 = new Articulos("Teclado", "01", "Informática", 50, 30);
            Articulos producto2 = new Articulos("Monitor", "02", "Informática", 30, 200);
            Articulos producto3 = new Articulos("Altavoces", "03", "Audio", 20, 50);

            listaArticulos.add(producto1);
            listaArticulos.add(producto2);
            listaArticulos.add(producto3);

            for (Articulos articulo : listaArticulos) {
                m.marshal(articulo, System.out); 
            }
            
            
        } catch (JAXBException e) {
            System.out.println("Error al ver el XML: " + e.getMessage());
            e.printStackTrace();
        } 
    }
}
