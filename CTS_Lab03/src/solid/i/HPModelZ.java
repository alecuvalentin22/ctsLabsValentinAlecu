package solid.i;

public class HPModelZ implements IPrintTask {
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean printContentExternalDevice(String content) {
        return false;
    }

    @Override
    public boolean authBadge(String content) {
        return false;
    }
}
