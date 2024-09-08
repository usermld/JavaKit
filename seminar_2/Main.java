import Server.ServerWindowController;
import Server.ServerWindowGUI;
import clients.ClientController;
import clients.ClientGUI;
import seminar_3.DB.DataBase;

public class Main {
    public static void main(String[] args) {


        DataBase dataBase = new DataBase();

        ServerWindowGUI serverWindowGUI = new ServerWindowGUI();
        ServerWindowController serverWindowController = new ServerWindowController(serverWindowGUI, dataBase);
        serverWindowGUI.setServerWindowController(serverWindowController);


        ClientGUI clientGUI1 = new ClientGUI();
        ClientController clientController1 = new ClientController(clientGUI1, serverWindowController);
        clientGUI1.setClientController(clientController1);

        ClientGUI clientGUI2 = new ClientGUI();
        ClientController clientController2 = new ClientController(clientGUI2, serverWindowController);
        clientGUI2.setClientController(clientController2);






    }


}