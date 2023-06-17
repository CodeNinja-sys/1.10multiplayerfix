/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.a.d.nj;
import com.a.a.d.ov;
import com.c.a.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.c.a;
import net.minecraft.c.b.i;
import net.minecraft.c.b.w;
import net.minecraft.u.bw;
import net.minecraft.w.a.b;
import org.apache.logging.log4j.c;

public class d {
    private static final org.apache.logging.log4j.d e = org.apache.logging.log4j.c.c();
    public static final File a = new File("banned-ips.txt");
    public static final File b = new File("banned-players.txt");
    public static final File c = new File("ops.txt");
    public static final File d = new File("white-list.txt");

    private static void a(a a2, Collection collection, com.c.a.i i2) {
        String[] arrstring = (String[])nj.a((Iterator)nj.b(collection.iterator(), new w()), String.class);
        if (a2.al()) {
            a2.aN().a(arrstring, com.c.a.a.a, i2);
        } else {
            String[] arrstring2 = arrstring;
            int n2 = arrstring.length;
            for (int i3 = 0; i3 < n2; ++i3) {
                String string = arrstring2[i3];
                UUID uUID = net.minecraft.w.a.b.a(new e(null, string));
                e e2 = new e(uUID, string);
                i2.a(e2);
            }
        }
    }

    public static String a(a a2, String string) {
        if (!bw.b(string) && string.length() <= 16) {
            e e2 = a2.aO().a(string);
            if (e2 != null && e2.a() != null) {
                return e2.a().toString();
            }
            if (!a2.ab() && a2.al()) {
                ArrayList arrayList = ov.a();
                i i2 = new i(a2, arrayList);
                net.minecraft.c.b.d.a(a2, ov.a(new String[]{string}), i2);
                return !arrayList.isEmpty() && ((e)arrayList.get(0)).a() != null ? ((e)arrayList.get(0)).a().toString() : "";
            }
            return net.minecraft.w.a.b.a(new e(null, string)).toString();
        }
        return string;
    }

    static /* synthetic */ org.apache.logging.log4j.d a() {
        return e;
    }
}

