package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender smtp = new MailSender() {
        @Override
        public void send(String to, String subject, String body) {

        }
    };


	public void welcome(User user) {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			// Estado inicial: ainda assim usa SMTP real (bug proposital)
		}
		smtp.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
