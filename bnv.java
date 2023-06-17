/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bnv {
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
        for (pb pb2 : this.a) {
            pb2.a(n2);
            n2 += pb2.a();
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

    private static pb a(int n2, String string, int n3) {
        bfa bfa2;
        Object object;
        String[] arrstring = n2 >= 3 ? string.split("\\*", 2) : string.split("x", 2);
        int n4 = 1;
        int n5 = 0;
        if (arrstring.length == 2) {
            try {
                n4 = Integer.parseInt(arrstring[0]);
                if (n3 + n4 >= 256) {
                    n4 = 256 - n3;
                }
                if (n4 < 0) {
                    n4 = 0;
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
                    n5 = Integer.parseInt(arrstring[1]);
                }
                bfa2 = bfa.f(Integer.parseInt(arrstring[0]));
            } else {
                arrstring = ((String)object).split(":", 3);
                bfa bfa3 = bfa2 = arrstring.length > 1 ? bfa.a(arrstring[0] + ":" + arrstring[1]) : null;
                if (bfa2 != null) {
                    n5 = arrstring.length > 2 ? Integer.parseInt(arrstring[2]) : 0;
                } else {
                    bfa2 = bfa.a(arrstring[0]);
                    if (bfa2 != null) {
                        int n6 = n5 = arrstring.length > 1 ? Integer.parseInt(arrstring[1]) : 0;
                    }
                }
                if (bfa2 == null) {
                    return null;
                }
            }
            if (bfa2 == blg.a) {
                n5 = 0;
            }
            if (n5 < 0 || n5 > 15) {
                n5 = 0;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        object = new pb(n2, n4, bfa2, n5);
        ((pb)object).a(n3);
        return object;
    }

    private static List a(int n2, String string) {
        if (string == null || string.length() < 1) {
            return null;
        }
        ArrayList arrayList = ov.a();
        String[] arrstring = string.split(",");
        int n3 = 0;
        for (String string2 : arrstring) {
            pb pb2 = bnv.a(n2, string2, n3);
            if (pb2 == null) {
                return null;
            }
            arrayList.add(pb2);
            n3 += pb2.a();
        }
        return arrayList;
    }

    public static bnv a(String string) {
        List list;
        int n2;
        if (string == null) {
            return bnv.e();
        }
        String[] arrstring = string.split(";", -1);
        int n3 = n2 = arrstring.length == 1 ? 0 : cmk.a(arrstring[0], 0);
        if (n2 < 0 || n2 > 3) {
            return bnv.e();
        }
        bnv bnv2 = new bnv();
        int n4 = arrstring.length == 1 ? 0 : 1;
        if ((list = bnv.a(n2, arrstring[n4++])) == null || list.isEmpty()) {
            return bnv.e();
        }
        bnv2.c().addAll(list);
        bnv2.d();
        int n5 = anr.a(cff.c);
        if (n2 > 0 && arrstring.length > n4) {
            n5 = cmk.a(arrstring[n4++], n5);
        }
        bnv2.a(n5);
        if (n2 > 0 && arrstring.length > n4) {
            String[] arrstring2;
            for (String string2 : arrstring2 = arrstring[n4++].toLowerCase().split(",")) {
                String[] arrstring3;
                String[] arrstring4 = string2.split("\\(", 2);
                HashMap hashMap = sz.c();
                if (arrstring4[0].isEmpty()) continue;
                bnv2.b().put(arrstring4[0], hashMap);
                if (arrstring4.length <= 1 || !arrstring4[1].endsWith(")") || arrstring4[1].length() <= 1) continue;
                for (String string3 : arrstring3 = arrstring4[1].substring(0, arrstring4[1].length() - 1).split(" ")) {
                    String[] arrstring5 = string3.split("=", 2);
                    if (arrstring5.length != 2) continue;
                    hashMap.put(arrstring5[0], arrstring5[1]);
                }
            }
        } else {
            bnv2.b().put("village", sz.c());
        }
        return bnv2;
    }

    public static bnv e() {
        bnv bnv2 = new bnv();
        bnv2.a(anr.a(cff.c));
        bnv2.c().add(new pb(1, blg.h));
        bnv2.c().add(new pb(2, blg.d));
        bnv2.c().add(new pb(1, blg.c));
        bnv2.d();
        bnv2.b().put("village", sz.c());
        return bnv2;
    }
}

