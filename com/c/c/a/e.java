/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.a.a.g.ak;
import com.a.a.i.bi;
import com.c.c.a.a;
import com.c.c.a.b;
import com.c.c.a.c;
import com.c.c.b.ab;
import com.c.c.d.a.z;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import org.apache.commons.b.o;

class e
implements ActionListener {
    private volatile File b;
    private volatile z c;
    private volatile ab d;
    final /* synthetic */ a a;

    private e(a a2, File file, z z2, ab ab2) {
        this.a = a2;
        this.b = file;
        this.c = z2;
        this.d = ab2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.c.a = ((c)actionEvent.getSource()).c();
        if (this.c.a >= this.c.b && !com.c.c.a.a.e(this.a)) {
            try {
                String string = ak.e().a(bi.d(this.b)).toString();
                if (string.equals(this.d.c)) {
                    o.c(this.b, com.c.c.a.a.f(this.a));
                    com.c.c.a.a.b(this.a, true);
                } else {
                    com.c.c.a.a.e().b("Resourcepack had wrong hash (expected " + this.d.c + ", found " + string + "). Deleting it.");
                    o.e(this.b);
                    com.c.c.a.a.a(this.a, true);
                }
            }
            catch (IOException iOException) {
                com.c.c.a.a.e().b("Error copying resourcepack file", iOException.getMessage());
                com.c.c.a.a.a(this.a, true);
            }
        }
    }

    /* synthetic */ e(a a2, File file, z z2, ab ab2, b b2) {
        this(a2, file, z2, ab2);
    }
}

