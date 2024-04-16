package services.swapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dto.api.ListOfMoviesDto;
import dto.api.ResultsDto;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static utility.ConfigUtils.props;

public class MovieService {

    public boolean Validate_MovieCount(String count) throws JsonProcessingException {
        ObjectMapper map = new ObjectMapper();
        map.registerModule(new JavaTimeModule());
        map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ListOfMoviesDto s = map.readValue(GetAllMovies().asPrettyString(),ListOfMoviesDto.class);
        return  Integer.parseInt(count)== s.getCount();
    }

    public boolean Validate_DirectorName(String Name, int id) throws JsonProcessingException {
        ObjectMapper map = new ObjectMapper();
        map.registerModule(new JavaTimeModule());
        map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ResultsDto s = map.readValue(GetAllMoviesById(id).asPrettyString(), ResultsDto.class);
        return s.getDirector().equals(Name);
    }

    public boolean Validate_ProducerNames(String Name, int id) throws JsonProcessingException {
        ObjectMapper map = new ObjectMapper();
        map.registerModule(new JavaTimeModule());
        map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ResultsDto s = map.readValue(GetAllMoviesById(id).asPrettyString(), ResultsDto.class);
        int count = 0 ;
        String []  names = Name.split(",");

        for (String name : names) {
            if (s.getProducer().contains(name)) {
                count++;
            }
        }
        return count==0;
    }

    private Response GetAllMovies() {
        ListOfMoviesDto lstOfMovie = new ListOfMoviesDto();
        RestAssured.baseURI = props.getProperty("BaseUrl");
        RequestSpecification reqSpec = RestAssured.given();
        return reqSpec.request(Method.GET, "films");
    }

    private Response GetAllMoviesById(int id)
    {
        RestAssured.baseURI=props.getProperty("BaseUrl");
        RequestSpecification reqSpec =RestAssured.given();
        return reqSpec.request(Method.GET,"films/"+id);
    }
}
