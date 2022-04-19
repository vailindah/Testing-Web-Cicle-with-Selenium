import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class GroupchatTest extends Base {

    @Test
    public void sendchat() throws InterruptedException {
        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send text
        grupchatPage.setext("panda");
        Thread.sleep(2000);
        grupchatPage.kliksend();
    }

    @Test
    public void sendattac() throws InterruptedException {
        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        String namehello = dasboardPage.getName();
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send image
        grupchatPage.setimage();
    }

    @Test
    public void deletemessage() throws InterruptedException {
        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        String namehello = dasboardPage.getName();
        // klik paket A
        dasboardPage.clickcard();
        // klik grup chat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickkutip();
        Thread.sleep(2000);
        // delete message
        grupchatPage.klikdelete();
        grupchatPage.klikbuttondel();
    }

    @Test
    public void sendtagname() throws InterruptedException {
        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send text
        grupchatPage.setext("@");
        Thread.sleep(2000);
        grupchatPage.klikNama();
        Thread.sleep(2000);
        grupchatPage.kliksend();
    }

    @Test
    public void seeProfile() throws InterruptedException {
        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        Thread.sleep(2000);
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        grupchatPage.clickProfil();
    }

    @Test
    public void sendchatfull() throws InterruptedException {
        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send text
        grupchatPage.setext("pelangipelangialahkahindahmumerahkuninghijaudilangit ygbiru pelukismu agung siapa geraknya pelangipelangi ciptaan tuhan");
        Thread.sleep(2000);
        grupchatPage.kliksend();
    }
}

