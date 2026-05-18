package manfred.exercises.design.behavioral.state.vote;

/**
 * 投票状态模式演示：模拟用户多次投票触发不同状态切换。
 */
public class VoteClient {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i = 0; i < 9; i++){
            vm.vote("u1", "A");
        }
    }
}
