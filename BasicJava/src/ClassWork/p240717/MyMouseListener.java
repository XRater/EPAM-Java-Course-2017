package ClassWork.p240717;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }
}
