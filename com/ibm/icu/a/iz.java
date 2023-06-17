/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ja;
import com.ibm.icu.d.jx;
import com.ibm.icu.d.jy;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.az;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class iz
implements jx,
az,
Cloneable {
    private jy a;
    private static iz b = new iz();
    private String c = "#";
    private String d = "=";
    private String e = "\n";
    private Appendable f = null;
    private Comparator g = new ja(this);

    public jy a() {
        return this.a;
    }

    public iz a(jy jy2) {
        this.a = jy2;
        return this;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String a(String var1_1) {
        var2_2 = new StringBuilder();
        var3_3 = new lf();
        var4_4 = new ParsePosition(0);
        var5_5 = 0;
        var6_6 = 0;
        while (var6_6 < var1_1.length()) {
            block11: {
                var7_7 = var1_1.charAt(var6_6);
                switch (var5_5) {
                    case 0: {
                        if (var7_7 != '\\') ** GOTO lbl16
                        if (lf.b(var1_1, var6_6)) {
                            var6_6 = this.a(var1_1, var6_6, var2_2, var3_3, var4_4);
                        } else {
                            var5_5 = 1;
                            break;
lbl16:
                            // 1 sources

                            if (var7_7 != '[' || !lf.b(var1_1, var6_6)) break;
                            var6_6 = this.a(var1_1, var6_6, var2_2, var3_3, var4_4);
                        }
                        break block11;
                    }
                    case 1: {
                        if (var7_7 == 'Q') {
                            var5_5 = 1;
                            break;
                        }
                        var5_5 = 0;
                        break;
                    }
                    case 2: {
                        if (var7_7 != '\\') break;
                        var5_5 = 3;
                        break;
                    }
                    case 3: {
                        if (var7_7 == 'E') {
                            var5_5 = 0;
                        }
                        var5_5 = 2;
                    }
                }
                var2_2.append(var7_7);
            }
            ++var6_6;
        }
        return var2_2.toString();
    }

    public static String b(String string) {
        return b.a(string);
    }

    public static Pattern c(String string) {
        return Pattern.compile(b.a(string));
    }

    public static Pattern a(String string, int n2) {
        return Pattern.compile(b.a(string), n2);
    }

    public String d(String string) {
        return this.a(Arrays.asList(string.split("\\r\\n?|\\n")));
    }

    public String a(List list) {
        Map map = this.b(list);
        LinkedHashSet linkedHashSet = new LinkedHashSet(map.keySet());
        for (int i2 = 0; i2 < 2; ++i2) {
            for (Map.Entry entry : map.entrySet()) {
                String string = (String)entry.getKey();
                String string2 = (String)entry.getValue();
                for (Map.Entry entry2 : map.entrySet()) {
                    String string3;
                    String string4 = (String)entry2.getKey();
                    String string5 = (String)entry2.getValue();
                    if (string.equals(string4) || (string3 = string5.replace(string, string2)).equals(string5)) continue;
                    linkedHashSet.remove(string);
                    map.put(string4, string3);
                    if (this.f == null) continue;
                    try {
                        this.f.append(string4 + "=" + string3 + ";");
                    }
                    catch (IOException iOException) {
                        throw (IllegalArgumentException)new IllegalArgumentException().initCause(iOException);
                    }
                }
            }
        }
        if (linkedHashSet.size() != 1) {
            throw new IllegalArgumentException("Not a single root: " + linkedHashSet);
        }
        return (String)map.get(linkedHashSet.iterator().next());
    }

    public String b() {
        return this.c;
    }

    public void e(String string) {
        this.c = string;
    }

    public String c() {
        return this.d;
    }

    public void f(String string) {
        this.d = string;
    }

    public String d() {
        return this.e;
    }

    public void g(String string) {
        this.e = string;
    }

    public static List a(List list, String string, String string2) {
        return iz.a(list, new FileInputStream(string), string2);
    }

    public static List a(List list, InputStream inputStream, String string) {
        String string2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, string == null ? "UTF-8" : string));
        while ((string2 = bufferedReader.readLine()) != null) {
            list.add(string2);
        }
        return list;
    }

    public iz e() {
        try {
            return (iz)this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalArgumentException();
        }
    }

    public iz g() {
        return this;
    }

    public boolean f() {
        return true;
    }

    private int a(String string, int n2, StringBuilder stringBuilder, lf lf2, ParsePosition parsePosition) {
        try {
            parsePosition.setIndex(n2);
            lf lf3 = lf2.g().a(string, parsePosition, this.a, 0);
            lf3.d().d();
            stringBuilder.append(lf3.a(false));
            n2 = parsePosition.getIndex() - 1;
            return n2;
        }
        catch (Exception exception) {
            throw (IllegalArgumentException)new IllegalArgumentException("Error in " + string).initCause(exception);
        }
    }

    private Map b(List list) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>(this.g);
        String string = null;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        for (String string2 : list) {
            int n3;
            String string3;
            String string4;
            int n4;
            ++n2;
            if (string2.length() == 0) continue;
            if (string2.charAt(0) == '\ufeff') {
                string2 = string2.substring(1);
            }
            if (this.c != null && (n4 = string2.indexOf(this.c)) >= 0) {
                string2 = string2.substring(0, n4);
            }
            if ((string4 = string2.trim()).length() == 0 || (string3 = string2).trim().length() == 0) continue;
            boolean bl2 = string4.endsWith(";");
            if (bl2) {
                string3 = string3.substring(0, string3.lastIndexOf(59));
            }
            if ((n3 = string3.indexOf(this.d)) >= 0) {
                if (string != null) {
                    throw new IllegalArgumentException("Missing ';' before " + n2 + ") " + string2);
                }
                string = string3.substring(0, n3).trim();
                if (treeMap.containsKey(string)) {
                    throw new IllegalArgumentException("Duplicate variable definition in " + string2);
                }
                stringBuffer.append(string3.substring(n3 + 1).trim());
            } else {
                if (string == null) {
                    throw new IllegalArgumentException("Missing '=' at " + n2 + ") " + string2);
                }
                stringBuffer.append(this.e).append(string3);
            }
            if (!bl2) continue;
            treeMap.put(string, stringBuffer.toString());
            string = null;
            stringBuffer.setLength(0);
        }
        if (string != null) {
            throw new IllegalArgumentException("Missing ';' at end");
        }
        return treeMap;
    }

    public /* synthetic */ Object i() {
        return this.e();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }
}

