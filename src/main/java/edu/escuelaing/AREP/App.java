package edu.escuelaing.AREP;


import org.primefaces.shaded.json.JSONObject;
import spark.Request;
import spark.Response;

import java.net.MalformedURLException;
import java.net.URL;
import static spark.Spark.*;
import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )  {
        port(getPort());
        Gson gson = new Gson();
        calculadora calculadora = new calculadora();
        get("/sin",(req,res) -> {
            double value = Double.parseDouble(req.queryParams("value"));
            double conexion = calculadora.sin(value);
            JSONObject rest=new JSONObject();
            rest.put("output",conexion);
            rest.put("input",value);
            rest.put("operacion","sin");
            return rest;
        });

        get("/tan",(req,res) -> {
            double value = Double.parseDouble(req.queryParams("value"));
            double con = calculadora.tan(value);
            JSONObject rest=new JSONObject();
            rest.put("output",con);
            rest.put("input",value);
            rest.put("operacion","tan");
            return rest;
        });

        get("/cos",(req,res) -> {
            double value = Double.parseDouble(req.queryParams("value"));
            double con = calculadora.cos(value);
            JSONObject rest=new JSONObject();
            rest.put("output",con);
            rest.put("input",value);
            rest.put("operacion","cos");
            return rest;
        });

    }


    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}