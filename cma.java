/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class cma {
    public static String a(String string, boolean bl2) {
        if (bl2 || bxy.B().u.o) {
            return string;
        }
        return aug.a(string);
    }

    public static List a(cbg cbg2, int n2, deb deb2, boolean bl2, boolean bl3) {
        int n3 = 0;
        aym aym2 = new aym("");
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a(cbg2);
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            String string;
            String string2;
            cbg cbg3 = (cbg)arrayList2.get(i2);
            String string3 = cbg3.b();
            boolean bl4 = false;
            if (string3.contains("\n")) {
                int n4 = string3.indexOf(10);
                string2 = string3.substring(n4 + 1);
                string3 = string3.substring(0, n4 + 1);
                aym aym3 = new aym(string2);
                aym3.a(cbg3.h().l());
                arrayList2.add(i2 + 1, aym3);
                bl4 = true;
            }
            string2 = (string = cma.a(cbg3.h().k() + string3, bl3)).endsWith("\n") ? string.substring(0, string.length() - 1) : string;
            int n5 = deb2.a(string2);
            aym aym4 = new aym(string2);
            aym4.a(cbg3.h().l());
            if (n3 + n5 > n2) {
                String string4;
                String string5 = deb2.a(string, n2 - n3, false);
                String string6 = string4 = string5.length() < string.length() ? string.substring(string5.length()) : null;
                if (string4 != null && !string4.isEmpty()) {
                    int n6 = string5.lastIndexOf(32);
                    if (n6 >= 0 && deb2.a(string.substring(0, n6)) > 0) {
                        string5 = string.substring(0, n6);
                        if (bl2) {
                            ++n6;
                        }
                        string4 = string.substring(n6);
                    } else if (n3 > 0 && !string.contains(" ")) {
                        string5 = "";
                        string4 = string;
                    }
                    aym aym5 = new aym(string4);
                    aym5.a(cbg3.h().l());
                    arrayList2.add(i2 + 1, aym5);
                }
                string = string5;
                n5 = deb2.a(string);
                aym4 = new aym(string);
                aym4.a(cbg3.h().l());
                bl4 = true;
            }
            if (n3 + n5 <= n2) {
                n3 += n5;
                aym2.a(aym4);
            } else {
                bl4 = true;
            }
            if (!bl4) continue;
            arrayList.add(aym2);
            n3 = 0;
            aym2 = new aym("");
        }
        arrayList.add(aym2);
        return arrayList;
    }
}

