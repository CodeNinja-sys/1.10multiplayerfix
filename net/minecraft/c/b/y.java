/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import java.io.File;
import java.net.SocketAddress;
import net.minecraft.c.b.aa;
import net.minecraft.c.b.b;
import net.minecraft.c.b.c;

public class y
extends b {
    public y(File file) {
        super(file);
    }

    @Override
    protected aa a(z z2) {
        return new c(z2);
    }

    public boolean a(SocketAddress socketAddress) {
        String string = this.c(socketAddress);
        return this.d(string);
    }

    public c b(SocketAddress socketAddress) {
        String string = this.c(socketAddress);
        return (c)this.a(string);
    }

    private String c(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(47) + 1);
        }
        if (string.contains(":")) {
            string = string.substring(0, string.indexOf(58));
        }
        return string;
    }
}

