/*   Ported from: src.gui.painting.qbrush.cpp
<snip>
//! [0]
        QPainter painter(this);

        painter.setBrush(Qt::cyan);
        painter.setPen(Qt::darkCyan);
        painter.drawRect(0, 0, 100,100);

        painter.setBrush(Qt::NoBrush);
        painter.setPen(Qt::darkGreen);
        painter.drawRect(40, 40, 100, 100);
//! [0]


</snip>
*/
import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class src_gui_painting_qbrush {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
        QPainter painter(this);

        painter.setBrush(Qt.cyan);
        painter.setPen(Qt.darkCyan);
        painter.drawRect(0, 0, 100,100);

        painter.setBrush(Qt.NoBrush);
        painter.setPen(Qt.darkGreen);
        painter.drawRect(40, 40, 100, 100);
//! [0]


    }
}