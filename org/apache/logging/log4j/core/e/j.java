/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.core.d.k;

public final class j {
    private static final int h = Integer.MAX_VALUE;
    protected static final j a = new j();
    private static final String i = "full";
    private static final String j = "none";
    private static final String k = "short";
    private final int l;
    private final String m;
    private final List n;
    public static final String b = "short.className";
    public static final String c = "short.methodName";
    public static final String d = "short.lineNumber";
    public static final String e = "short.fileName";
    public static final String f = "short.message";
    public static final String g = "short.localizedMessage";

    protected j(int n2, String string, List list) {
        this.l = n2;
        this.m = string == null ? org.apache.logging.log4j.core.d.k.e : string;
        this.n = list;
    }

    protected j(List list) {
        this(Integer.MAX_VALUE, null, list);
    }

    protected j() {
        this(Integer.MAX_VALUE, null, null);
    }

    public int a() {
        return this.l;
    }

    public String b() {
        return this.m;
    }

    public List c() {
        return this.n;
    }

    public boolean d() {
        return this.l == Integer.MAX_VALUE;
    }

    public boolean e() {
        return this.l > 0;
    }

    public int a(int n2) {
        return this.l > n2 ? n2 : this.l;
    }

    public boolean f() {
        return this.n != null && !this.n.isEmpty();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{").append(this.d() ? i : (this.l == 2 ? k : (this.e() ? String.valueOf(this.l) : j))).append("}");
        stringBuilder.append("{separator(").append(this.m).append(")}");
        if (this.f()) {
            stringBuilder.append("{filters(");
            for (String string : this.n) {
                stringBuilder.append(string).append(",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append(")}");
        }
        return stringBuilder.toString();
    }

    public static j a(String[] arrstring) {
        ArrayList<String> arrayList;
        String string;
        if (arrstring == null || arrstring.length == 0) {
            return a;
        }
        if (arrstring.length == 1 && arrstring[0] != null && arrstring[0].length() > 0) {
            String[] arrstring2 = arrstring[0].split(",", 2);
            string = arrstring2[0].trim();
            arrayList = new Scanner(string);
            if (arrstring2.length > 1 && (string.equalsIgnoreCase(i) || string.equalsIgnoreCase(k) || string.equalsIgnoreCase(j) || ((Scanner)((Object)arrayList)).hasNextInt())) {
                arrstring = new String[]{string, arrstring2[1].trim()};
            }
            ((Scanner)((Object)arrayList)).close();
        }
        int n2 = org.apache.logging.log4j.core.e.j.a.l;
        string = org.apache.logging.log4j.core.e.j.a.m;
        arrayList = org.apache.logging.log4j.core.e.j.a.n;
        for (String string2 : arrstring) {
            String string3;
            if (string2 == null || (string3 = string2.trim()).isEmpty()) continue;
            if (string3.startsWith("separator(") && string3.endsWith(")")) {
                string = string3.substring("separator(".length(), string3.length() - 1);
                continue;
            }
            if (string3.startsWith("filters(") && string3.endsWith(")")) {
                String[] arrstring3;
                String string4 = string3.substring("filters(".length(), string3.length() - 1);
                if (string4.length() <= 0 || (arrstring3 = string4.split(",")).length <= 0) continue;
                arrayList = new ArrayList<String>(arrstring3.length);
                for (String string5 : arrstring3) {
                    if ((string5 = string5.trim()).length() <= 0) continue;
                    arrayList.add(string5);
                }
                continue;
            }
            if (string3.equalsIgnoreCase(j)) {
                n2 = 0;
                continue;
            }
            if (string3.equalsIgnoreCase(k) || string3.equalsIgnoreCase(b) || string3.equalsIgnoreCase(c) || string3.equalsIgnoreCase(d) || string3.equalsIgnoreCase(e) || string3.equalsIgnoreCase(f) || string3.equalsIgnoreCase(g)) {
                n2 = 2;
                continue;
            }
            if (string3.equalsIgnoreCase(i)) continue;
            n2 = Integer.parseInt(string3);
        }
        return new j(n2, string, arrayList);
    }
}

