
import ElementosDeAnalisis.*;
import GestionClientes.*;
import GestionFacturacion.*;
import GestionInstalacion.*;
import GestionPropiedades.*;
import GestionServicio.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * Entrega nro 4 del PPAI (Implementaciion)
 * Integrantes Abanto Diego, Crespo Mickaela, Garcia C. Eliana, Senn Juan Pablo
 * Facturacion v0.0.0.00000000000001
 */
/**
 *
 * @author john
 */
public class Main {

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static void main(String[] args) {

        Date d1 = parseDate("2017-01-01");
        Date d2 = parseDate("2017-02-01");
        Date d3 = parseDate("2017-03-01");
        Date d4 = parseDate("2017-04-01");
        Date d5 = parseDate("2017-05-01");
        Date d6 = parseDate("2017-06-01");
        Date d7 = parseDate("2017-07-01");
        Date d8 = parseDate("2017-08-01");
        Date d9 = parseDate("2017-09-01");
        Date d10 = parseDate("2017-10-01");
        Date d11 = parseDate("2017-11-01");
        Date d12 = parseDate("2017-04-15");
        Date d13 = parseDate("2017-07-10");

        PeriodoFacturacion pf1 = new PeriodoFacturacion(d1, d2, "Periodo Enero");
        PeriodoFacturacion pf2 = new PeriodoFacturacion(d2, d3, "Periodo Febrero");
        PeriodoFacturacion pf3 = new PeriodoFacturacion(d3, d4, "Periodo Marzo");
        PeriodoFacturacion pf4 = new PeriodoFacturacion(d4, d5, "Periodo Abril");
        PeriodoFacturacion pf5 = new PeriodoFacturacion(d5, d6, "Periodo Mayo");
        PeriodoFacturacion pf6 = new PeriodoFacturacion(d6, d7, "Periodo Junio");
        PeriodoFacturacion pf7 = new PeriodoFacturacion(d7, d8, "Periodo Julio");
        PeriodoFacturacion pf8 = new PeriodoFacturacion(d8, d9, "Periodo Agosto");
        PeriodoFacturacion pf9 = new PeriodoFacturacion(d9, d10, "Periodo Septiembre");
        PeriodoFacturacion pf10 = new PeriodoFacturacion(d10, d11, "Periodo Octubre");
        
        PeriodoFacturacion[] periodos = new PeriodoFacturacion[10];
        periodos[0] = pf1;
        periodos[1] = pf2;
        periodos[2] = pf3;
        periodos[3] = pf4;
        periodos[4] = pf5;
        periodos[5] = pf6;
        periodos[6] = pf7;
        periodos[7] = pf8;
        periodos[8] = pf9;
        periodos[9] = pf10;

        
        
        SolicitudBonificacion sb1 = new SolicitudBonificacion(d4, d12, d6);
        SolicitudBonificacion sb2 = new SolicitudBonificacion(d7, d13);

        SolicitudBonificacion[] sol = new SolicitudBonificacion[2];
        sol[0] = sb1;
        sol[1] = sb2;
                 
        Categoria c1 = new Categoria(0, 30, 50, "Categoria 1");
        Categoria c2 = new Categoria(0, 50, 100, "Categoria 2");
        Categoria c3 = new Categoria(0, 70, 150, "Categoria 3");
        
        Categoria[] cat = new Categoria[3];
        cat[0] = c1;
        cat[1] = c2;
        cat[1] = c3;
        
        Servicio s1 = new Servicio(d2,d1,c1,sol);
        
        Estado e1 = new Estado("Lectura","Corregida Facturada");
        Estado e2 = new Estado("Lectura","Facturada Sin Control");
        Estado e3 = new Estado("Lectura","Pendiente de Revision");
        Estado e4 = new Estado("Lectura","Controlada Facturada");
        Estado e5 = new Estado("Lectura","Creada");
        
        
        Lectura l1 = new Lectura(d6,40,e4);
        Lectura l2 = new Lectura(d7,35,e4);
        Lectura l3 = new Lectura(d8,50,e4);
        Lectura l4 = new Lectura(d9,20,e5);
        
        Lectura[] lecturas = new Lectura[4];
        lecturas[0] = l1;
        lecturas[1] = l2;
        lecturas[2] = l3;
        lecturas[3] = l4;
        
        Medidor m1 = new Medidor(1,lecturas,d5);
        l4.setMedidor(m1);
        l3.setMedidor(m1);
        l2.setMedidor(m1);
        l1.setMedidor(m1);
        Medidor[] medidores = new Medidor[1];
        medidores[0] = m1;
        
        Instalacion i1 = new Instalacion(d5,1,medidores);
        m1.setInstalacion(i1);
        
        Propiedad p1 = new Propiedad("Pueyrredon","A",1,45,2,s1,i1);
        i1.setPropiedad(p1);
        
        Propiedad[] propiedades = new Propiedad[1];
        propiedades[0] = p1;
        
        Zona z1 = new Zona("Capital",propiedades);
        Zona[] zonas = new Zona[1];
        zonas[0] = z1;
        p1.setZona(z1);
        
        CondicionTributaria ct1 = new CondicionTributaria("Monotributista",10);
        Impuesto imp1 = new Impuesto("IVA",20);
        Impuesto imp2 = new Impuesto("Impuesto Monotributo",10,ct1);
        Impuesto[] impuestos = new Impuesto[1];
        impuestos[0] = imp1;
        impuestos[1] = imp2;
        

        Localidad loc1 = new Localidad("Córdoba",zonas,impuestos);
        z1.setLocalidad(loc1);
        
        DomicilioFacturacion domfac1 = new DomicilioFacturacion("Juan Neper","Capital",d1,5520,0);
        
        Cliente cli1 = new Cliente("Diego","Abanto",39697663,1,d3,ct1,domfac1);
        s1.setCliente(cli1);
        
        ConceptoFacturado confac1 = new ConceptoFacturado("Costo de Impresion",3);
        ConceptoFacturado confac2 = new ConceptoFacturado("Costo administrativo",300);
        ConceptoFacturado[] conceptos = new ConceptoFacturado[2];
        conceptos[0] = confac1;
        conceptos[1] = confac2;
        
        GestorFacturacionInSitu gestor = new GestorFacturacionInSitu(conceptos,l4);
        gestor.generarFacturacionInSitu(periodos, p1, "1");
        

        

        

    }
}
