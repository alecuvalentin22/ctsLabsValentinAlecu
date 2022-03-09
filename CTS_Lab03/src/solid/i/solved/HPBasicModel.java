package solid.i.solved;

public class HPBasicModel implements IPrintTask, IPrintExternalDeviceTask, IScanTask{
    @Override
    public boolean printContentExternalDevice(String content) {
        return false;
    }

    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }
}
