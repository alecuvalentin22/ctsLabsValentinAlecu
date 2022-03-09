package solid.i.solved;

public class CannonModelUltraPerforming implements IPrintTask, IScanTask, IFaxTask, IPrintExternalDeviceTask, IBadgeAuthentication{
    @Override
    public boolean authBadge(String content) {
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
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }
}
