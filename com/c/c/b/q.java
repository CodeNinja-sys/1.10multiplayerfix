/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.t;
import com.a.b.w;
import com.a.b.z;
import com.c.c.e.a;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class q {
    private static final d c = org.apache.logging.log4j.c.c();
    private static final ab d = new ab();
    public long a;
    public List b;

    public static q a(z z2) {
        q q2 = new q();
        try {
            w w2;
            q2.a = com.c.c.e.a.a("serverId", z2, -1L);
            String string = com.c.c.e.a.a("playerList", z2, null);
            q2.b = string != null ? ((w2 = d.a(string)).p() ? q.a(w2.u()) : new ArrayList()) : new ArrayList();
        }
        catch (Exception exception) {
            c.b("Could not parse RealmsServerPlayerList: " + exception.getMessage());
        }
        return q2;
    }

    private static List a(t t2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (w w2 : t2) {
            try {
                arrayList.add(w2.d());
            }
            catch (Exception exception) {}
        }
        return arrayList;
    }
}

