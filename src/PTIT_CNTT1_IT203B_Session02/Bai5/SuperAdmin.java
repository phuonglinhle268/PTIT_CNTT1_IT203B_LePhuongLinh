package PTIT_CNTT1_IT203B_Session02.Bai5;

public class SuperAdmin implements UserActions, AdminActions {
    @Override
    public void logActivity(String activity){
        AdminActions.super.logActivity(activity);
    }
}
