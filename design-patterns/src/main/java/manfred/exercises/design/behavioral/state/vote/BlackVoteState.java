package manfred.exercises.design.behavioral.state.vote;

/**
 * 黑名单投票状态，禁止用户登录和使用系统。
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
