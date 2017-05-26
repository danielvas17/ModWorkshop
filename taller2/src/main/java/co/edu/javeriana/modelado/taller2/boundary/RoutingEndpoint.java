package co.edu.javeriana.modelado.taller2.boundary;

import co.edu.javeriana.modelado.taller2.entity.Service;
import java.io.FileReader;
import java.util.Iterator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


@Path("enrutador")
public class RoutingEndpoint {
    
    @GET
    @Path("{serviceId}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Service getService(@PathParam("serviceId") int serviceId) {
//        JSONParser parser = new JSONParser();
//        
//        try {
// 
//            Object obj = parser.parse(new FileReader(
//                    "/Users/<username>/Documents/file1.txt"));
// 
//            JSONObject jsonObject = (JSONObject) obj;
// 
//            String name = (String) jsonObject.get("Name");
//            String author = (String) jsonObject.get("Author");
//            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
// 
//            System.out.println("Name: " + name);
//            System.out.println("Author: " + author);
//            System.out.println("\nCompany List:");
//            Iterator<String> iterator = companyList.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
// 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        return new Service(serviceId, "localhost", 8080, "dsdadsa");
    }
}
