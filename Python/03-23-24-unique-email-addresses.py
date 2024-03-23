from typing import List


class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique_emails = set()

        for email in emails:
            local_name, domain_name = email.split("@")
            plus_idx = local_name.find("+")

            if plus_idx != -1:
                local_name = local_name[:plus_idx]

            local_name = local_name.replace(".", "")
            unique_emails.add(local_name + "@" + domain_name)

        return len(unique_emails)
