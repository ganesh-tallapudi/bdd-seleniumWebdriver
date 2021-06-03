public enum Status {

    AVAILABLE("available"),
    PENDING("pending"),
    SOLD("sold");

    private String status;
    Status(String status) {
        this.status=status;
    }

}
