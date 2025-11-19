package exam1105;

public class RemoteRepository implements MemoRepository{
	@Override
	public void addMemo(String id ,String body) {
		System.out.println("원격서버 메모를 저장합니다.");
	}
	
	@Override
	public void getMemos() {
		System.out.println("원격서버 메모를 조회합니다.");
	}
	
	@Override
	public void deleteMemo(String id) {
		System.out.println("원격서버 메모를 삭제합니다.");
	}
	@Override
	public void updateMemo(String id ,String body) {
		System.out.println("원격 서버 메모를 수정합니다.");
	}

}
