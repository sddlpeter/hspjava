package com.hspedu.tankgame5;

import java.io.*;
import java.util.Vector;

public class Recorder {
    private static int allEnemyTankNum = 0;
    private static FileWriter fw = null;
    private static Vector<EnemyTank> enemyTanks = null;

    private static String recordFile = "src\\myRecord.txt";

    private static Vector<Node> nodes = new Vector<>();

    public static Vector<Node> getNodesAndEnemyTankRec() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(recordFile));
        allEnemyTankNum = Integer.parseInt(bufferedReader.readLine());
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] xyd = line.split("\\s");
            Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
            nodes.add(node);
        }
        bufferedReader.close();

        return nodes;
    }


    public static void keepRecord() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(recordFile));
        bufferedWriter.write(allEnemyTankNum + "\r\n");
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            bufferedWriter.write(enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirection() + "\r\n");
        }

        bufferedWriter.close();

    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }
}
