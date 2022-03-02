import java.util.Arrays;

/**
 * Copyright 2021 (C) javatar
 *
 * @author esmaeil sadeghi
 * @email esmailsadeghijob@gmail.com
 * @date 3/2/22
 */
public class Block {

    private int blockHash; // !
    private int previousBlockHash;
    private String[] transaction;

    public Block(String[] transaction, int previousBlockHash) {
        super();
        this.previousBlockHash = previousBlockHash;
        this.transaction = transaction;
        this.blockHash = Arrays.hashCode(new int[]{Arrays.hashCode(transaction), this.previousBlockHash});
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public String[] getTransaction() {
        return transaction;
    }

    public void setTransaction(String[] transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Block{" +
                "blockHash=" + blockHash +
                ", previousBlockHash=" + previousBlockHash +
                ", transaction=" + Arrays.toString(transaction) +
                '}';
    }
}
