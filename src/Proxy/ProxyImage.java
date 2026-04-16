package Proxy;

class ProxyImage implements Image {
    private RealImage realImage;
    private String file;

    public ProxyImage(String file) {
        this.file = file;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(file); // lazy loading
        }
        realImage.display();
    }
}
