/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ds.desktop.notify.DesktopNotify;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patricio
 */
public class Hilo_comprobar extends Thread {

    private Data d;
    private int diaActual;
    private List<Serie> listaSeries;
    private boolean iniciar;

    public Hilo_comprobar() throws ClassNotFoundException, SQLException {
        d = new Data();
        iniciar = true;
    }

    public void run() {

        while (iniciar) {
            try {
                diaActual = d.getDiaActual();
                listaSeries = d.getSeries(diaActual);

                if (!listaSeries.isEmpty()) {
                    for (Serie s : listaSeries) {
                        DesktopNotify.showDesktopMessage("Series de el dia!", s.getNombre(), DesktopNotify.INFORMATION, 5000);
                    }

                } else {
                    DesktopNotify.showDesktopMessage("Series de el dia!", "No tienes series para ver hoy! :c", DesktopNotify.INFORMATION, 5000);
                }
                Thread.sleep(300000);

            } catch (SQLException ex) {
                Logger.getLogger(Hilo_comprobar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_comprobar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
