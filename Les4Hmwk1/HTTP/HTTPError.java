public enum HTTPError {
    BAD_REQUEST(400,"The server cannot or will not process the request due to an apparent client error"),
    UNAUTHORIZED(401,"Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided."),
    PAYMENT_REQUIRED(402,"Reserved for future use."),
    FORBIDDEN(403,"The request contained valid data and was understood by the server, but the server is refusing action."),
    NOT_FOUND(404,"The requested resource could not be found but may be available in the future. Subsequent requests by the client are permissible.");
// I understand that such description is wrong with so many letters, but don't know what's right on this stage, so...
    private int number;
    private String disc;

    HTTPError(int number, String disc){
    this.number = number;
    this.disc = disc;
    }
    public String getDisc() {
        return disc;
    }
}
