import java.util.ArrayList;

/**
 * Copyright 2021 (C) javatar
 *
 * @author esmaeil sadeghi
 * @email esmailsadeghijob@gmail.com
 * @date 3/2/22
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Block> blockChain =  new ArrayList<>();

        // block first -2121688958
        String[] initialValues = {"ali $900", "ali $700"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println(firstBlock.getBlockHash());
        System.out.println("Fist block is " + firstBlock.toString());
        System.out.println("The Block chain is " + blockChain.toString());

        // block two 1712530551
        String[] twoInitialValues = {"hasan $40", "hasan $30", "hasan $900"};
        Block secondBlock = new Block(twoInitialValues, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println(secondBlock.getBlockHash());
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The Block chain is " + blockChain.toString());

        // block three -260812487
        String[] threeInitialValues = {"hamed $130", "hamed $150"};
        Block threeBlock = new Block(threeInitialValues, secondBlock.getBlockHash());
        blockChain.add(threeBlock);
        System.out.println(threeBlock.getBlockHash());
        System.out.println("Second block is " + threeBlock.toString());
        System.out.println("The Block chain is " + blockChain.toString());
    }
}
