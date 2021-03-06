package model;


public class Neighbour {


    private double cornerTopRightX;
    private double cornerTopRightY;
    private double cornerTopLeftX;
    private double cornerTopLeftY;
    private double cornerBottomRightX;
    private double cornerBottomRightY;
    private double cornerBottomLeftX;
    private double cornerBottomLeftY;
    private double punktX;
    private double punktY;
    private String UIP;
    private double RTT;
    private boolean checked;
    private long uid;

     public Neighbour(long uid, boolean checked,
                        double cornerTopRightX, double cornerTopRightY, double cornerTopLeftX, double cornerTopLeftY,
                        double cornerBottomRightX, double cornerBottomRightY, double cornerBottomLeftX, double cornerBottomLeftY,
                        double punktX, double punktY, String UIP, double RTT) {
        this.uid = uid;
        this.checked = checked;
        this.cornerTopRightX = cornerTopRightX;
        this.cornerTopRightY = cornerTopRightY;
        this.cornerTopLeftX = cornerTopLeftX;
        this.cornerTopLeftY = cornerTopLeftY;
        this.cornerBottomRightX = cornerBottomRightX;
        this.cornerBottomRightY = cornerBottomRightY;
        this.cornerBottomLeftX = cornerBottomLeftX;
        this.cornerBottomLeftY = cornerBottomLeftY;
        this.punktX = punktX;
        this.punktY = punktY;
        this.UIP = UIP;
        this.RTT = RTT;
    }

//    public double getCornerTopRight() {
//        return cornerTopRight;
//    }
//
//    public void setCornerTopRight(double cornerTopRight) {
//        this.cornerTopRight = cornerTopRight;
//    }
//
//    public double getCornerTopLeft() {
//        return cornerTopLeft;
//    }
//
//    public void setCornerTopLeft(double cornerTopLeft) {
//        this.cornerTopLeft = cornerTopLeft;
//    }
//
//    public double getCornerBottomRight() {
//        return cornerBottomRight;
//    }
//
//    public void setCornerBottomRight(double cornerBottomRight) {
//        this.cornerBottomRight = cornerBottomRight;
//    }
//
//    public double getCornerBottomLeft() {
//        return cornerBottomLeft;
//    }
//
//    public void setCornerBottomLeft(double cornerBottomLeft) {
//        this.cornerBottomLeft = cornerBottomLeft;
//    }

    public void setCornerBottomLeft(double x, double y)
    {
        setCornerBottomLeftX(x);
        setCornerBottomLeftY(y);
    }

    public void setCornerBottomRight(double x, double y)
    {
        setCornerBottomRightX(x);
        setCornerBottomRightY(y);
    }

    public void setCornerTopLeft(double x, double y)
    {
        setCornerTopLeftX(x);
        setCornerTopLeftY(y);
    }

    public void setCornerTopRight(double x, double y)
    {
        setCornerTopRightX(x);
        setCornerTopRightY(y);
    }

    public double getCornerTopRightX() {
        return cornerTopRightX;
    }

    private void setCornerTopRightX(double cornerTopRightX) {
        this.cornerTopRightX = cornerTopRightX;
    }

    public double getCornerTopRightY() {
        return cornerTopRightY;
    }

    private void setCornerTopRightY(double cornerTopRightY) {
        this.cornerTopRightY = cornerTopRightY;
    }

    public double getCornerTopLeftX() {
        return cornerTopLeftX;
    }

    private void setCornerTopLeftX(double cornerTopLeftX) {
        this.cornerTopLeftX = cornerTopLeftX;
    }

    public double getCornerTopLeftY() {
        return cornerTopLeftY;
    }

    private void setCornerTopLeftY(double cornerTopLeftY) {
        this.cornerTopLeftY = cornerTopLeftY;
    }

    public double getCornerBottomRightX() {
        return cornerBottomRightX;
    }

    private void setCornerBottomRightX(double cornerBottomRightX) {
        this.cornerBottomRightX = cornerBottomRightX;
    }

    public double getCornerBottomRightY() {
        return cornerBottomRightY;
    }

    private void setCornerBottomRightY(double cornerBottomRightY) {
        this.cornerBottomRightY = cornerBottomRightY;
    }

    public double getCornerBottomLeftX() {
        return cornerBottomLeftX;
    }

    private void setCornerBottomLeftX(double cornerBottomLeftX) {
        this.cornerBottomLeftX = cornerBottomLeftX;
    }

    public double getCornerBottomLeftY() {
        return cornerBottomLeftY;
    }

    private void setCornerBottomLeftY(double cornerBottomLeftY) {
        this.cornerBottomLeftY = cornerBottomLeftY;
    }

    public double getPunktX() {
        return punktX;
    }

    public void setPunktX(double punktX) {
        this.punktX = punktX;
    }

    public double getPunktY() {
        return punktY;
    }

    public void setPunktY(double punktY) {
        this.punktY = punktY;
    }

    public String getUIP() {
        return UIP;
    }

    public void setUIP(String UIP) {
        this.UIP = UIP;
    }

    public double getRTT() {
        return RTT;
    }

    public void setRTT(double RTT) {
        this.RTT = RTT;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public long getUid() {
        return uid;
    }

    public  void setUid(long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        String output = uid + " -- " + UIP +
                "\nCorner top Left : x -> "+ cornerTopLeftX + " -- y -> "+ cornerTopLeftY +
                "\nCorner top Right : x -> "+ cornerTopRightX + " -- y -> "+ cornerTopRightY +
                "\nCorner Bottom Left : x -> "+ cornerBottomLeftX + " -- y -> "+ cornerBottomLeftY +
                "\nCorner Bottom Right : x -> "+ cornerBottomRightX + " -- y -> "+ cornerBottomRightY +
                "\nCorner Punkt : x -> "+ punktX + " -- y -> "+ punktY +
                "\n RTT : "+ RTT;
        return output;
    }
}
