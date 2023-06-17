/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.d;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.ji;

public class jh {
    private static ji[] a;
    private static String b;
    private static ji[] c;
    private static Map d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;

    private static void e() {
        if (d != null) {
            return;
        }
        d = new HashMap();
        try {
            String string;
            Process process = Runtime.getRuntime().exec(new String[]{"xrandr", "-q"});
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String string2 = null;
            int[] arrn = new int[2];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrstring = e.split(string = string.trim());
                if ("connected".equals(arrstring[1])) {
                    if (string2 != null) {
                        d.put(string2, arrayList2.toArray(new ji[arrayList2.size()]));
                        arrayList2.clear();
                    }
                    string2 = arrstring[0];
                    if ("primary".equals(arrstring[2])) {
                        jh.a(arrn, arrstring[3]);
                        b = string2;
                        continue;
                    }
                    jh.a(arrn, arrstring[2]);
                    continue;
                }
                Matcher matcher = g.matcher(arrstring[0]);
                if (!matcher.matches()) continue;
                jh.a(arrayList2, arrayList, string2, Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), arrstring, arrn);
            }
            d.put(string2, arrayList2.toArray(new ji[arrayList2.size()]));
            a = arrayList.toArray(new ji[arrayList.size()]);
            if (b == null) {
                long l2 = Long.MIN_VALUE;
                for (ji ji2 : a) {
                    if (1L * (long)ji2.b * (long)ji2.c <= l2) continue;
                    b = ji2.a;
                    l2 = 1L * (long)ji2.b * (long)ji2.c;
                }
            }
        }
        catch (Throwable throwable) {
            org.lwjgl.d.a((CharSequence)("Exception in XRandR.populate(): " + throwable.getMessage()));
            d.clear();
            a = new ji[0];
        }
    }

    public static ji[] a() {
        jh.e();
        for (ji ji2 : a) {
            if (!ji2.a.equals(b)) continue;
            return new ji[]{ji2};
        }
        return (ji[])a.clone();
    }

    public static void a(boolean bl2, ji ... arrji) {
        if (arrji.length == 0) {
            throw new IllegalArgumentException("Must specify at least one screen");
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("xrandr");
        if (bl2) {
            for (ji ji2 : a) {
                boolean bl3 = true;
                for (ji ji3 : arrji) {
                    if (!ji3.a.equals(ji2.a)) continue;
                    bl3 = false;
                    break;
                }
                if (!bl3) continue;
                arrayList.add("--output");
                arrayList.add(ji2.a);
                arrayList.add("--off");
            }
        }
        for (ji ji2 : arrji) {
            ji.a(ji2, arrayList);
        }
        try {
            String string;
            Process process = Runtime.getRuntime().exec(arrayList.toArray(new String[arrayList.size()]));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((string = bufferedReader.readLine()) != null) {
                org.lwjgl.d.a((CharSequence)("Unexpected output from xrandr process: " + string));
            }
            a = arrji;
        }
        catch (IOException iOException) {
            org.lwjgl.d.a((CharSequence)("XRandR exception in setConfiguration(): " + iOException.getMessage()));
        }
    }

    public static void b() {
        jh.e();
        c = (ji[])a.clone();
    }

    public static void c() {
        if (c != null) {
            jh.a(true, c);
        }
    }

    public static String[] d() {
        jh.e();
        return d.keySet().toArray(new String[d.size()]);
    }

    public static ji[] a(String string) {
        jh.e();
        return (ji[])((ji[])d.get(string)).clone();
    }

    private static void a(List list, List list2, String string, int n2, int n3, String[] arrstring, int[] arrn) {
        for (int i2 = 1; i2 < arrstring.length; ++i2) {
            String string2 = arrstring[i2];
            if ("+".equals(string2)) continue;
            Matcher matcher = h.matcher(string2);
            if (!matcher.matches()) {
                org.lwjgl.d.a((CharSequence)("Frequency match failed: " + Arrays.toString(arrstring)));
                return;
            }
            int n4 = Integer.parseInt(matcher.group(1));
            ji ji2 = new ji(string, n2, n3, n4, 0, 0);
            if (string2.contains("*")) {
                list2.add(new ji(string, n2, n3, n4, arrn[0], arrn[1]));
                list.add(0, ji2);
                continue;
            }
            list.add(ji2);
        }
    }

    private static void a(int[] arrn, String string) {
        Matcher matcher = f.matcher(string);
        if (!matcher.matches()) {
            arrn[0] = 0;
            arrn[1] = 0;
            return;
        }
        arrn[0] = Integer.parseInt(matcher.group(3));
        arrn[1] = Integer.parseInt(matcher.group(4));
    }

    static ji a(DisplayMode displayMode) {
        jh.e();
        ji ji2 = jh.b(a);
        return new ji(ji2.a, displayMode.b(), displayMode.c(), displayMode.e(), ji2.e, ji2.f);
    }

    static DisplayMode a(ji ... arrji) {
        jh.e();
        ji ji2 = jh.b(arrji);
        return new DisplayMode(ji2.b, ji2.c, 24, ji2.d);
    }

    private static ji b(ji ... arrji) {
        for (ji ji2 : arrji) {
            if (!ji2.a.equals(b)) continue;
            return ji2;
        }
        return arrji[0];
    }

    static {
        e = Pattern.compile("\\s+");
        f = Pattern.compile("^(\\d+)x(\\d+)[+](\\d+)[+](\\d+)$");
        g = Pattern.compile("^(\\d+)x(\\d+)$");
        h = Pattern.compile("^(\\d+)[.](\\d+)(?:\\s*[*])?(?:\\s*[+])?$");
    }
}

