public class _14_StringRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //c.concat(a).concat(b).concat("\n"); // 500 => 2ms
            //c += a + b + "\n"; //500 => 19
            sb.append(a).append(b).append("\n"); // 11
        }
        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
