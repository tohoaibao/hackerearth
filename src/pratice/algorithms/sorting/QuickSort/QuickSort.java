package pratice.algorithms.sorting.QuickSort;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class QuickSort {

    private static void swap(int A[], int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    private static int partition(int A[], int start, int end) {

        int i = start + 1;
        int piv = A[start];
        for (int j = start + 1; j <= end; j++) {
            if (A[j] < piv) {
                swap(A, i, j);
                i++;
            }
        }
        swap(A, start, i - 1);

        return i - 1;
    }

    private static void quickSort(int A[], int start, int end) {
        if (start < end) {
            int piv_pos = partition(A, start, end);
            quickSort(A, start, piv_pos - 1);
            quickSort(A, piv_pos + 1, end);
        }
    }

    public static void main(String[] args) {
        try(Reader reader = new Reader()) {
            int N = reader.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = reader.nextInt();
            }

            quickSort(A, 0, N - 1);
            for (int item: A) {
                System.out.printf(item + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class Reader implements AutoCloseable
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[2048]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
}

