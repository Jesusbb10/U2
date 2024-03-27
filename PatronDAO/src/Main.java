public class Main {
    public static void main(String[] args) {
        RaperoDAO raperoDAO = new RaperoDAOImpl();
        Rapero kaseo = new Rapero(004, "Javier", "Kaseo", "Rap", 1987);
        Rapero Jesus = new Rapero(003, "Jesus", "J3ssVs", "Rap", 1950);


        raperoDAO.obtenerTodosLosRaperos();

        raperoDAO.anyadirRapero(kaseo);

        raperoDAO.obtenerTodosLosRaperos();
        
        raperoDAO.eliminarRapero(004);



    }
}