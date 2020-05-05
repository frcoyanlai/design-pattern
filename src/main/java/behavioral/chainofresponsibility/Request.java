package behavioral.chainofresponsibility;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:13
 **/
public class Request {
    private RequestType type;
    private String name;


    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }


    public RequestType getType() {
        return type;
    }


    public String getName() {
        return name;
    }
}
