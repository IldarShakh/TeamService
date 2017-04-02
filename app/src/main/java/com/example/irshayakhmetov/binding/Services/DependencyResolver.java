package ru.dixy.ubiworkerchecklistsmobile.Services;

import ru.dixy.ubiworkerchecklistsmobile.Services.FileService.CardService;
import ru.dixy.ubiworkerchecklistsmobile.Services.FileService.FtpService;
import ru.dixy.ubiworkerchecklistsmobile.Services.FileService.ICardService;
import ru.dixy.ubiworkerchecklistsmobile.Services.FileService.IFileService;
import ru.dixy.ubiworkerchecklistsmobile.Common.ContextUtil;
import ru.dixy.ubiworkerchecklistsmobile.Tools.DatabaseHandler;

public class DependencyResolver {
    static public <T> Object GetService(Class<T> type) {

        if (ContextUtil.GetContextApplication().HOST == null) {
            DatabaseHandler DH = new DatabaseHandler();
            ContextUtil.GetContextApplication().HOST = DH.getHost();
            ;
        }

        String host = ContextUtil.GetContextApplication().HOST;//"http://srv-ubiua-01";// "http://10.0.17.58";// "http://srv-ubiua-01";
        //String pricehost = "http://10.0.7.234";//http://srv-devsp-01";

        boolean isMock = false;

        Object instance = null;
        if (type == IDataService.class) {
            if (isMock) {
                //instance = new MockDataService();
            } else {
                instance = new RestDataServiceNTLM(host, ContextUtil.GetContextApplication().credential);//
                // new RestDataService(host);
            }
        }

        if (type == ICardService.class) {
            instance = new CardService();
        }

        if (type == IFileService.class) {
            instance = new FtpService();
        }

        if (type == INavigationService.class) {
            instance = new NavigationService();
        }
        if (type == ILogicService.class) {
            instance = new LogicService((IDataService) GetService(IDataService.class), (INavigationService) GetService(INavigationService.class));
        }

        return instance;
    }
}
