/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.a;

import com.sun.jna.a.a.d;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class g
implements ActionListener {
    final /* synthetic */ Timer a;
    final /* synthetic */ d b;

    g(d d2, Timer timer) {
        this.b = d2;
        this.a = timer;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Point point = d.a(this.b).getLocationOnScreen();
        Point point2 = new Point(d.b(this.b));
        int n2 = (point2.x - point.x) / 2;
        int n3 = (point2.y - point.y) / 2;
        if (n2 != 0 || n3 != 0) {
            point.translate(n2, n3);
            this.b.a(point);
        } else {
            this.a.stop();
            this.b.a();
        }
    }
}

