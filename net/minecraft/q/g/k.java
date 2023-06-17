/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.a.i;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.q.b.q;
import net.minecraft.q.g.e;
import net.minecraft.u.b.n;

public class k {
    private final List a = ov.a();
    private final Map b = sz.c();
    private int c;

    public int a() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public Map b() {
        return this.b;
    }

    public List c() {
        return this.a;
    }

    public void d() {
        int n2 = 0;
        for (e e2 : this.a) {
            e2.a(n2);
            n2 += e2.a();
        }
    }

    public String toString() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(3);
        stringBuilder.append(";");
        for (n2 = 0; n2 < this.a.size(); ++n2) {
            if (n2 > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(this.a.get(n2));
        }
        stringBuilder.append(";");
        stringBuilder.append(this.c);
        if (this.b.isEmpty()) {
            stringBuilder.append(";");
        } else {
            stringBuilder.append(";");
            n2 = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                if (n2++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((String)entry.getKey()).toLowerCase());
                Map map = (Map)entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int n3 = 0;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (n3++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append((String)entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)entry2.getValue());
                }
                stringBuilder.append(")");
            }
        }
        return stringBuilder.toString();
    }

    private static e a(int n2, String string, int n3) {
        cn cn2;
        Object object;
        int n4;
        int n5;
        block15: {
            String[] arrstring = n2 >= 3 ? string.split("\\*", 2) : string.split("x", 2);
            n5 = 1;
            n4 = 0;
            if (arrstring.length == 2) {
                try {
                    n5 = Integer.parseInt(arrstring[0]);
                    if (n3 + n5 >= 256) {
                        n5 = 256 - n3;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                }
                catch (Throwable throwable) {
                    return null;
                }
            }
            try {
                object = arrstring[arrstring.length - 1];
                if (n2 < 3) {
                    arrstring = ((String)object).split(":", 2);
                    if (arrstring.length > 1) {
                        n4 = Integer.parseInt(arrstring[1]);
                    }
                    cn2 = cn.d(Integer.parseInt(arrstring[0]));
                    break block15;
                }
                arrstring = ((String)object).split(":", 3);
                cn cn3 = cn2 = arrstring.length > 1 ? cn.a(String.valueOf(arrstring[0]) + ":" + arrstring[1]) : null;
                if (cn2 != null) {
                    n4 = arrstring.length > 2 ? Integer.parseInt(arrstring[2]) : 0;
                } else {
                    cn2 = cn.a(arrstring[0]);
                    if (cn2 != null) {
                        int n6 = n4 = arrstring.length > 1 ? Integer.parseInt(arrstring[1]) : 0;
                    }
                }
                if (cn2 != null) break block15;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        if (cn2 == p.a) {
            n4 = 0;
        }
        if (n4 < 0 || n4 > 15) {
            n4 = 0;
        }
        object = new e(n2, n5, cn2, n4);
        ((e)object).a(n3);
        return object;
    }

    private static List a(int n2, String string) {
        if (string != null && string.length() >= 1) {
            ArrayList arrayList = ov.a();
            String[] arrstring = string.split(",");
            int n3 = 0;
            String[] arrstring2 = arrstring;
            int n4 = arrstring.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                String string2 = arrstring2[i2];
                e e2 = k.a(n2, string2, n3);
                if (e2 == null) {
                    return null;
                }
                arrayList.add(e2);
                n3 += e2.a();
            }
            return arrayList;
        }
        return null;
    }

    public static k a(String string) {
        int n2;
        if (string == null) {
            return k.e();
        }
        String[] arrstring = string.split(";", -1);
        int n3 = n2 = arrstring.length == 1 ? 0 : n.a(arrstring[0], 0);
        if (n2 >= 0 && n2 <= 3) {
            List list;
            k k2 = new k();
            int n4 = arrstring.length == 1 ? 0 : 1;
            if ((list = k.a(n2, arrstring[n4++])) != null && !list.isEmpty()) {
                k2.c().addAll(list);
                k2.d();
                int n5 = q.a(i.c);
                if (n2 > 0 && arrstring.length > n4) {
                    n5 = n.a(arrstring[n4++], n5);
                }
                k2.a(n5);
                if (n2 > 0 && arrstring.length > n4) {
                    String[] arrstring2;
                    String[] arrstring3 = arrstring2 = arrstring[n4++].toLowerCase().split(",");
                    int n6 = arrstring2.length;
                    for (int i2 = 0; i2 < n6; ++i2) {
                        String[] arrstring4;
                        String string2 = arrstring3[i2];
                        String[] arrstring5 = string2.split("\\(", 2);
                        HashMap hashMap = sz.c();
                        if (arrstring5[0].isEmpty()) continue;
                        k2.b().put(arrstring5[0], hashMap);
                        if (arrstring5.length <= 1 || !arrstring5[1].endsWith(")") || arrstring5[1].length() <= 1) continue;
                        String[] arrstring6 = arrstring4 = arrstring5[1].substring(0, arrstring5[1].length() - 1).split(" ");
                        int n7 = arrstring4.length;
                        for (int i3 = 0; i3 < n7; ++i3) {
                            String string3 = arrstring6[i3];
                            String[] arrstring7 = string3.split("=", 2);
                            if (arrstring7.length != 2) continue;
                            hashMap.put(arrstring7[0], arrstring7[1]);
                        }
                    }
                } else {
                    k2.b().put("village", sz.c());
                }
                return k2;
            }
            return k.e();
        }
        return k.e();
    }

    public static k e() {
        k k2 = new k();
        k2.a(q.a(i.c));
        k2.c().add(new e(1, p.h));
        k2.c().add(new e(2, p.d));
        k2.c().add(new e(1, p.c));
        k2.d();
        k2.b().put("village", sz.c());
        return k2;
    }
}

