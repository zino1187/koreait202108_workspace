package com.koreait.music;

/* �� Ŭ������ ��� ����� ������ ������ Ŭ������ �� 
�ʼ����� ����� ������ �� �ִ� ������ ������ Ŭ����!!
*/

//�� Ŭ������ �ǵ��Ͽ� �ҿ����ϰ� ������ ���̴�!!
public abstract class MusicPlayer{
	// mp3 �����ϴ� ��� 
	//������ �ø��� ���
	//������ ������ ��� 

	//abstract �����ڸ� �̿��ϸ�, �����Ϸ��� �� �޼��带 �߻�޼���� �ν�...
	public abstract void supportMp3();//�̷��� ��� ������ ������ �����ڵ��� � ��⸦
	//������ ������ �� �����Ƿ�, �ڵ� ������� �ش� ��⸶�� ������ �����Ұ�..
	public abstract void volumeUp();
	public abstract void volumeDown();
}	
