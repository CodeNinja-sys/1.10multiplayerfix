/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.k.ce;
import net.minecraft.client.r;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.u.d.o;

public class y {
    public static String a(String string, boolean bl2) {
        return !bl2 && !r.z().w.o ? o.a(string) : string;
    }

    public static List a(a a2, int n2, ce ce2, boolean bl2, boolean bl3) {
        int n3 = 0;
        k k2 = new k("");
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a(a2);
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            String string;
            String string2;
            a a3 = (a)arrayList2.get(i2);
            String string3 = a3.b();
            boolean bl4 = false;
            if (string3.contains("\n")) {
                int n4 = string3.indexOf(10);
                string2 = string3.substring(n4 + 1);
                string3 = string3.substring(0, n4 + 1);
                k k3 = new k(string2);
                k3.a(a3.a().l());
                arrayList2.add(i2 + 1, k3);
                bl4 = true;
            }
            string2 = (string = y.a(String.valueOf(a3.a().k()) + string3, bl3)).endsWith("\n") ? string.substring(0, string.length() - 1) : string;
            int n5 = ce2.a(string2);
            k k4 = new k(string2);
            k4.a(a3.a().l());
            if (n3 + n5 > n2) {
                String string4;
                String string5 = ce2.a(string, n2 - n3, false);
                String string6 = string4 = string5.length() < string.length() ? string.substring(string5.length()) : null;
                if (string4 != null && !string4.isEmpty()) {
                    int n6 = string5.lastIndexOf(32);
                    if (n6 >= 0 && ce2.a(string.substring(0, n6)) > 0) {
                        string5 = string.substring(0, n6);
                        if (bl2) {
                            ++n6;
                        }
                        string4 = string.substring(n6);
                    } else if (n3 > 0 && !string.contains(" ")) {
                        string5 = "";
                        string4 = string;
                    }
                    k k5 = new k(string4);
                    k5.a(a3.a().l());
                    arrayList2.add(i2 + 1, k5);
                }
                n5 = ce2.a(string5);
                k4 = new k(string5);
                k4.a(a3.a().l());
                bl4 = true;
            }
            if (n3 + n5 <= n2) {
                n3 += n5;
                k2.a(k4);
            } else {
                bl4 = true;
            }
            if (!bl4) continue;
            arrayList.add(k2);
            n3 = 0;
            k2 = new k("");
        }
        arrayList.add(k2);
        return arrayList;
    }
}

