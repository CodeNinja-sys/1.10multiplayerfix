/*
 * Decompiled with CFR 0.150.
 */
package com.c.b;

import com.a.a.b.bx;
import com.a.a.b.dg;
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.g.ak;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.b.b;
import org.apache.commons.b.t;

public class a {
    static final Set a = aad.a();
    private static final String b = "_minecraft._tcp.";
    private static final bx c = bx.a('.');
    private static final dg d = dg.a('.');
    private static final Charset e = org.apache.commons.b.b.a;

    public static boolean a(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (string.startsWith(b)) {
            string = string.substring(b.length());
        }
        while (string.charAt(string.length() - 1) == '.') {
            string = string.substring(0, string.length() - 1);
        }
        if (com.c.b.a.b(string)) {
            return true;
        }
        ArrayList arrayList = ov.a(d.a(string));
        boolean bl2 = com.c.b.a.a(arrayList);
        if (!bl2 && com.c.b.a.b("*." + string)) {
            return true;
        }
        while (arrayList.size() > 1) {
            arrayList.remove(bl2 ? arrayList.size() - 1 : 0);
            String string2 = bl2 ? c.a(arrayList) + ".*" : "*." + c.a(arrayList);
            if (!com.c.b.a.b(string2)) continue;
            return true;
        }
        return false;
    }

    private static boolean a(List list) {
        if (list.size() != 4) {
            return false;
        }
        for (String string : list) {
            try {
                int n2 = Integer.parseInt(string);
                if (n2 >= 0 && n2 <= 255) continue;
                return false;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(String string) {
        return a.contains(ak.e().a(string.toLowerCase().getBytes(e)).toString());
    }

    static {
        try {
            a.addAll(t.c(new URL("https://sessionserver.mojang.com/blockedservers").openConnection().getInputStream(), e));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

