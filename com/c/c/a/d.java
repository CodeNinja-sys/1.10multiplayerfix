/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.a;
import com.c.c.a.b;
import com.c.c.a.c;
import com.c.c.b.ab;
import com.c.c.d.a.z;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class d
implements ActionListener {
    private volatile String b;
    private volatile File c;
    private volatile net.minecraft.s.c d;
    private volatile z e;
    private volatile ab f;
    final /* synthetic */ a a;

    private d(a a2, String string, File file, net.minecraft.s.c c2, z z2, ab ab2) {
        this.a = a2;
        this.b = string;
        this.c = file;
        this.d = c2;
        this.e = z2;
        this.f = ab2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.e.a = ((c)actionEvent.getSource()).c();
        if (this.e.a >= this.e.b && !com.c.c.a.a.e(this.a) && !com.c.c.a.a.d(this.a)) {
            try {
                com.c.c.a.a.c(this.a, true);
                com.c.c.a.a.a(this.a, this.b, this.c, this.d);
            }
            catch (IOException iOException) {
                com.c.c.a.a.a(this.a, true);
            }
        }
    }

    /* synthetic */ d(a a2, String string, File file, net.minecraft.s.c c2, z z2, ab ab2, b b2) {
        this(a2, string, file, c2, z2, ab2);
    }
}

